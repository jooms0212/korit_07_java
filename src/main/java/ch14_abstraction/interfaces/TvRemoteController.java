package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;        // 접근 지정자가 클래스명 객체명 -> 여태까지의 작성방법과 다릅니다.
    private ChanelDownButton chanelDownButton;
    private ChanelUpButton chanelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChanelDownButton chanelDownButton,
                              ChanelUpButton chanelUpButton,
                              VolumeUpButton volumeUpButton,
                              VolumeDownButton volumeDownButton) {
        this.powerButton = powerButton;
        this.chanelDownButton = chanelDownButton;
        this.chanelUpButton = chanelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이제 이상에서 선언한 필드(객체)의 메서드를 호출하는 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        chanelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        chanelDownButton.onDown();
    }
    // onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드를 구현하시고,
    // Main에서 실행하여
    // 실행 예
    // 채널을 한 칸 올립니다
    // 채널을 계속 올립니다.

    public void onPressedChannelUpButton() {
        chanelUpButton.onPressed();
    }

    // #1번째 방법
    public String onUpChannelUpButton1() {
        return chanelUpButton.onUp();
    }
    // # 2번째 방법
    public void onUpChannelUpButton2() {
        System.out.println(chanelUpButton.onUp());
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }
    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public void onUpVolumeUpButton1() {
        System.out.println(volumeUpButton.onUp());
    }

    public String onUpVolumeUpButton2() {
        return volumeUpButton.onUp();
    }
}
