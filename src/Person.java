public class Person {
    String name;
    int birthMonth;

    public Person(String name, int heightMn){
        this.name=name;
        this.heightMn= heightMn;
    }
    
    @Override
    public String toString(){
        String heightMn;
        return "Person[name="+ name +", heightMn="+heightMn+"]";
    }

    public Person(int heightMn){
        
    }
     
    @Override
    public boolean equals(Object that){
        if(!(obj instanceof Person)) {
            return false;
        }
        Person that= (Person) obj;
        return (this.name == that.name) && (this.heightMn == that.heightMn);
    }
}