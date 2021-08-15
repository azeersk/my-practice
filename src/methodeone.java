public class methodeone {
    public int channel;
    public int volumeLevel;
    public boolean on;

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }
    public void getChannel(){
        System.out.println(channel);
    }
    public void setChannel(){
        if ((on && 1 <= channel)&&(channel <= 120))
        channel = channel;
        //System.out.println(channel);
    }
    public void getVolumeLevel(){
        System.out.println(volumeLevel);
    }
    public void setVolumeLevel(){
        if (on && 1<= volumeLevel && volumeLevel<=7){
            volumeLevel = volumeLevel;
            //System.out.println(volumeLevel);
        }
    }
    public void channelUp(){
        if (on && channel < 120){
            channel += 1;
        }
    }
    public void channelDown(){
        if (on && channel>1){
            channel-= 1;
        }
    }
    public void volumeUp(){
        if (on && volumeLevel<7){
            volumeLevel += 1;
        }
    }
    public void volumeDown(){
        if (on && volumeLevel>1){
            volumeLevel -= 1;
        }
    }
    int x,y;
    methodeone(int ina,int outa){
        x = ina;
        y = outa;
    }
    void print(){
        System.out.println("print :" + (x*y));
    }
}
