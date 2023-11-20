package employeeApp.model;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;

    private String[] developerNames;

    private void checkGiro(double giro){
        if(giro < 0){
            this.giro = 0;
        } else{
            this.giro = giro;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        this.giro = giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public Company(int id, String name, String[] developerNames) {
        this.id = id;
        this.name = name;
        checkGiro(giro);
        this.developerNames = developerNames;
    }

    public void addEmployee(int index,String name){
        try{
            if(developerNames[index]==null){
                developerNames[index]=name;
            }else {
                System.out.println("index dolu");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("olmayan index için atama yapuldı"+ index);
        }

    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
