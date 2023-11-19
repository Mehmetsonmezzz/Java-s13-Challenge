package employeeApp.model;

import java.util.Arrays;


//POJO (Plain Old Java Object)
public class Employee {
    private int id;
    private String fullName;
    private String email;

    private String password;

    private String[] healthPlans;

    public Employee(int id,String fullName){
        this.id =id;
        this.fullName=fullName;
    }


    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }

    //flag (boolean)
    public void addHealthplan(int index,String name){
        if(index<0){
            System.out.println("Index değeri 0'dan büyük olmalı");
        }
        else{
            try {
                boolean isExist = false;
                for (String healthplan : healthPlans) {
                    if (healthplan !=null && healthplan.equals(name)) {
                        isExist = true;
                        break;
                    }
                }
                if (!isExist) {
                    if (healthPlans[index] == null) {
                        healthPlans[index] = name;
                    } else {
                        System.out.println("index dolu");
                    }
                }
            } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Invalid index: " +index);
            } catch (NullPointerException npe){
                System.out.println("Nul Pointer Exception" + npe.getMessage());
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
