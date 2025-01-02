package sep3;

 class Iphone extends SmartPhone implements Camera,MusicPlayer,Internet {

  Iphone(String model){
   super(model,"Apple");
  }

  @Override
  public void takePicture() {
   System.out.println("Iphone taking pic..");
  }

  @Override
  public void recordVideo() {
   System.out.println("Recording video");

  }

  @Override
  public void browseWeb() {
   System.out.println("Browsing web");

  }

  @Override
  public void playMusic() {
   System.out.println("Playing music");
  }

  @Override
  void makeCall(String phoneNo) {
   System.out.println("calling "+phoneNo);

  }
 }
