package ch14_abstraction.interfaces;

public class ChanelDownButton extends Button{
    @Override
    public void onPressed() {
        System.out.println("채널은 한 칸 내립니다.");
    }

    @Override
    public void onDown() {
        System.out.println("채널을 계속 내립니다.");
    }
}
