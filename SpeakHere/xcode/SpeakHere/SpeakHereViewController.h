@import UIKit;
@import AVFoundation;

#import "AQLevelMeter.h"

@interface SpeakHereViewController : UIViewController <AVAudioSessionDelegate,
    UINavigationBarDelegate>

- (IBAction)record:(UIBarButtonItem *)sender;
- (IBAction)play:(UIBarButtonItem *)sender;

@property (weak, nonatomic) IBOutlet UIBarButtonItem *btn_record;
@property (weak, nonatomic) IBOutlet UIBarButtonItem *btn_play;
@property (weak, nonatomic) IBOutlet AQLevelMeter *lvlMeter_in;
@property (weak, nonatomic) IBOutlet UILabel *fileDescription;
@end
