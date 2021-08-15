public class mainClass {
    public static void main(String[] args){
        methodeone obj = new methodeone(12,23);
        obj.channel = 1;
        obj.volumeLevel = 2;
        obj.on = false;
        obj.turnOn();
        //obj.turnOff();
        obj.getChannel();
        obj.setChannel();
        obj.getVolumeLevel();
        obj.getChannel();
        obj.setVolumeLevel();
        obj.getChannel();
        obj.channelUp();
        obj.getChannel();
        obj.channelDown();
        obj.getChannel();
        obj.volumeUp();
        obj.volumeDown();
        obj.turnOff();
        obj.getChannel();

    }
}
