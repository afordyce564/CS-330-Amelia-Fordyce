public class Dog {
    String dog_name; //dog's name
    int calendar_age; //dog's calendar age
    int dog_human_age; //dog's human age
    int dog_weight; //dog's weight
    String dog_designation; //designates a dog as puppy or old dog
    

    public Dog(String name, int cal_age, int human_age, int weight, String designation){
        dog_name = name;
        calendar_age = cal_age;
        dog_human_age = human_age;
        dog_weight = weight;
        dog_designation = designation;

    }


    //getters
    public String getName(){return dog_name;}

    public int getCalAge(){return calendar_age;}

    public int getHumanAge(){return dog_human_age;}

    public int getWeight(){return dog_weight;}

    public String designation(){return dog_designation;}

    //setters
    public void setName(String name){this.dog_name = name;}

    public void setCalAge(int cal_age){this.calendar_age = cal_age;}

    public void setHumanAge(int human_age){this.dog_human_age = human_age;}

    public void setWeight(int weight){this.dog_weight = weight;}

    public void setDesignation(String designation){this.dog_designation = designation;}


    //to string
    public String toString(){
        return("Name: "+this.dog_name+" Calendar Age: "+this.calendar_age+" Human Age: "+this.dog_human_age+" Weight: "+this.dog_weight+ " Designation: "+ this.dog_designation);
    }

    //compare to 
    
    public int compareTo(Dog other){
        return(this.calendar_age-other.calendar_age);
    }
    

}
