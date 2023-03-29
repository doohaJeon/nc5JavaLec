package chap07_inherit.animal;

public class Bear extends Animal{
    // 멤버 변수
    private boolean omnivorous; // 잡식성 여부
    private boolean likesHoney; // 꿀을 좋아하는지 여부
    private String habitat; // 서식지
    private String species; // 종
    
    // 생성자
    public Bear(boolean omnivorous, boolean likesHoney, String habitat, String species) {
        this.omnivorous = omnivorous;
        this.likesHoney = likesHoney;
        this.habitat = habitat;
        this.species = species;
    }
    
    // 멤버 메소드
    public void hibernate() {
        System.out.println("곰이 겨울잠을 잔다.");
    }
    
    public void swim() {
        System.out.println("곰이 수영한다.");
    }
    
    // getter 메소드
    public boolean isOmnivorous() {
        return omnivorous;
    }
    
    public boolean likesHoney() {
        return likesHoney;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public String getSpecies() {
        return species;
    }
}

