public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirsForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int thirsForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirsForPower = thirsForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirsForPower() {
        return thirsForPower;
    }

    public void setThirsForPower(int thirsForPower) {
        this.thirsForPower = thirsForPower;
    }

    public int ability() {
        return cunning + determination + ambition + ingenuity + thirsForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent) {
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n", getName(), slytherinStudent.getName(), ability1, ability2);
        } else if (ability2 > ability1) {
            System.out.printf("Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability2, ability1);
        } else {
            System.out.printf("Слизеренец %s такой же слизеренец %s: %d VS %d%n", slytherinStudent.getName(), getName(), ability1, ability2);
        }
    }

    @Override
    public String toString() {
        return String.format( "%s; Cлизеринец " + getName() +
                " хитрость =" + cunning +
                ", решительность =" + determination +
                ", амбициозность =" + ambition +
                ", нахъодчивость =" + ingenuity +
                ", жажда власти =" + thirsForPower, super.toString())
                ;
    }
}
