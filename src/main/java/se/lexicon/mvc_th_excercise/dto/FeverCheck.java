package se.lexicon.mvc_th_excercise.dto;

public class FeverCheck {
    private int degrees;
    private String level;

    public FeverCheck() {
    }

    public int getDegrees() {
        return degrees;
    }

    public void setDegrees(int degrees) {
        this.degrees = degrees;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "FeverCheck{" +
                "degrees=" + degrees +
                ", level='" + level + '\'' +
                '}';
    }
}
