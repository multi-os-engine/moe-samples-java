    package org.moe.benchmark.obj;

    import org.moe.benchmark.*;
    import org.moe.benchmark.SOR;

    public class kernel
    {

        public static double measureSOR(int N, double min_time, Random R) {
            Double G[][] = RandomMatrix(N, N, R);

            Stopwatch Q = new Stopwatch();
            int cycles=1;
            while(true) {
                Q.start();
                org.moe.benchmark.obj.SOR.execute(1.25, G, cycles);
                Q.stop();
                if (Q.read() >= min_time) break;

                cycles *= 2;
            }
            // approx Mflops
            return SOR.num_flops(N, N, cycles) / Q.read() * 1.0e-6;
        }

      private static Double[] NewVectorCopy(double x[]) {
            int N = x.length;

          Double y[] = new Double[N];
            for (int i=0; i<N; i++)
                y[i] = x[i];

            return y;
      }

      private static void CopyVector(Double B[], Double A[]) {
            int N = A.length;

            for (int i=0; i<N; i++)
                B[i] = A[i];
      }


      private static double normabs(Double x[], Double y[]) {
            int N = x.length;
            double sum = 0.0;

            for (int i=0; i<N; i++)
                sum += Math.abs(x[i]-y[i]);

            return sum;
      }

      private static void CopyMatrix(Double B[][], Double A[][]) {
            int M = A.length;
            int N = A[0].length;

            int remainder = N & 3;         // N mod 4;

            for (int i=0; i<M; i++) {
                Double Bi[] = B[i];
                Double Ai[] = A[i];
                for (int j=0; j<remainder; j++)
                    Bi[j] = Ai[j];
                for (int j=remainder; j<N; j+=4) {
                    Bi[j] = Ai[j];
                    Bi[j+1] = Ai[j+1];
                    Bi[j+2] = Ai[j+2];
                    Bi[j+3] = Ai[j+3];
                }
            }
      }

      private static Double[][] RandomMatrix(int M, int N, Random R) {
            Double A[][] = new Double[M][N];
            for (int i=0; i<N; i++)
                for (int j=0; j<N; j++)
                    A[i][j] = R.nextDouble();
            return A;
      }

        private static Double[] RandomVector(int N, Random R) {
            Double A[] = new Double[N];

            for (int i=0; i<N; i++)
                A[i] = R.nextDouble();
            return A;
        }

        private static Double[] matvec(Double A[][], Double x[]) {
            int N = x.length;
            Double y[] = new Double[N];

            matvec(A, x, y);

            return y;
        }

        private static void matvec(Double A[][], Double x[], Double y[]) {
            int M = A.length;
            int N = A[0].length;

            for (int i=0; i<M; i++) {
                double sum = 0.0;
                Double Ai[] = A[i];
                for (int j=0; j<N; j++)
                    sum += Ai[j] * x[j];

                y[i] = sum;
            }
        }

    }
