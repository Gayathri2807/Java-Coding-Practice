/*Think of a mobile phone volume
- You can't directly access the volume circuit
- You use buttons to increase or decrease it 
 */

 //Class that encapsulates volume control
class MobilePhone {

    //Private field(encapsulated)
    private int volume = 5; //Default volume level (0 to 10)

    //Public method to increase volume
    public void increaseVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume is at maximum!");
        }
    }

    //Public method to decrease volume
    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        } else {
            System.out.println("Volume is at minimum!");
        }
    }

    //Public method to get current volume
    public int getVolume() {
        return volume;
    }
}

public class VolumeDemo {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();

        phone.increaseVolume(); // Volume 6
        phone.increaseVolume(); //Volume 7
        phone.decreaseVolume(); //Volume 6

        System.out.println("Current Volume: " + phone.getVolume());

        //Trying to directly access volume will fail
        //phone.volume = 100; //volume has private access
    }
}