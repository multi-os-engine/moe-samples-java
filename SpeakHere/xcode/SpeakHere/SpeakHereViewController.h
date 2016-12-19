#import <UIKit/UIKit.h>
#import <AVFoundation/AVAudioSession.h>
#import "AQLevelMeter.h"

@interface SpeakHereViewController : UIViewController <AVAudioSessionDelegate>

- (IBAction)record:(UIBarButtonItem *)sender;
- (IBAction)play:(UIBarButtonItem *)sender;

@property (weak, nonatomic) IBOutlet UIBarButtonItem *btn_record;
@property (weak, nonatomic) IBOutlet UIBarButtonItem *btn_play;
@property (weak, nonatomic) IBOutlet AQLevelMeter *lvlMeter_in;
@property (weak, nonatomic) IBOutlet UILabel *fileDescription;
@end
