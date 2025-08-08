package ch14_abstraction.interfaces;

public class ModeChangeButton extends Button{
    private boolean mode;
    @Override
    public void onPressed() {
        if (mode) {
            mode = false;
            System.out.println("냉방으로 바뀝니다.");
        } else {
            mode = true;
            System.out.println("난방으로 바뀝니다.");
        }
    }
}
