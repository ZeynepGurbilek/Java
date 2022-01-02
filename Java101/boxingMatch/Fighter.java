public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int turn;

    Fighter(String name, int damage, int health,int weight, int dodge,int turn){
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        this.turn = turn;
        if(dodge >= 0 && dodge <=100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
    }
    int hit(Fighter foe){
        System.out.println(this.name + "=> " + foe.name + " |" + "damage caused =>"+ this.damage );
        if (foe.isDodge()){
          System.out.println(foe.name + "   blocked the upcoming damage.");
            System.out.println("-----------------------------");
          return foe.health;
        }
        if(foe.health - this.damage < 0){
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge(){
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }

    boolean isTurn(){
        double randomNmbr = Math.random()*100;
        return randomNmbr <= this.turn;
    }
}
