package employeeApp;

import employeeApp.enums.Plan;
import employeeApp.model.Company;
import employeeApp.model.Employee;
import employeeApp.model.Healthplan;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */

    private static void workWithData ()
    {
        Healthplan healthplan1=new Healthplan(1,"A Sigorta", Plan.ADVANCE);
        Healthplan healthplan2=new Healthplan(2,"B Sigorta", Plan.MEDIUM);

        String[] healtplans = new String[4];
        healtplans[0] = healthplan1.getName();
        healtplans[1] = healthplan2.getName();

        Employee employee1 =new Employee(1,"mehmet","msmsm@mhm","423l534l5",healtplans);
        employee1.addHealthplan(2,"C Sigorta");
        employee1.addHealthplan(2,"C Sigorta");
        System.out.println(Arrays.toString(employee1.getHealthPlans()));


        Company company = new Company(1, "Workintech"
                , new String[]{"Dogancan Kınık", "Omer Fatih Tanriverdi", null});

        company.addEmployee(0, "Ali Veli");
        company.addEmployee(2, "Mehmet Ali");
        company.addEmployee(-1, "Mehmet Ali");
        company.addEmployee(5, "Mehmet Ali");

        System.out.println(Arrays.toString(company.getDeveloperNames()));
        System.out.println(company);

    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
