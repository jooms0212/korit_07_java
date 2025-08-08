package ch14_abstraction.interfaces;
/*
    VolumeDownButton / VolumeUpButton 클래스를 생성하고
    얘를 TvRemoteController의 필드에 추가하고
    onPressedVolumeDownbutton() / onDownVolumeDownButton()
    onPressedVolumeUpButton() / onUpVolumeUpButton() 메서드를 정의하시고
    Main에서
    음량을 한 칸 내립니다
    음량을 계속 내립니다
    음량을 한 칸 올립니다
    음량을 계속 올립니다
    음량을 계속 올립니다
 */
public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChanelDownButton chanelDownButton = new ChanelDownButton();
//        ChanelUpButton chanelUpButton = new ChanelUpButton();
//        TvRemoteController tvRemoteController = new TvRemoteController(
//                powerButton, chanelDownButton, chanelUpButton
//        );
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();


        // 굳이 별개의 버튼 객체들을 만들지 않고 TvRemoteController 객체를
        // 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChanelDownButton(), new ChanelUpButton(),
                new VolumeUpButton(), new VolumeDownButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        String result = tvRemoteController.onUpChannelUpButton1();
        System.out.println(result); // # 방법 1
        tvRemoteController.onUpChannelUpButton2();  // # 방법 2
        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        tvRemoteController.onUpVolumeUpButton1();
        System.out.println(tvRemoteController.onUpVolumeUpButton2());

        System.out.println();
        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureDownButton(), new TemperatureUpButton(),
                new ModeChangeButton()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton());
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedModeChangeButton();
        airConditionerController.onPressedPowerButton();
    }
}
