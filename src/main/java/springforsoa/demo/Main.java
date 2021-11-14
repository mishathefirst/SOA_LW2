package springforsoa.demo;

import springforsoa.demo.entities.Organization;
import springforsoa.demo.cruds.OrganizationCRUD;

public class Main {

    public static void main(String[] args) {
        OrganizationCRUD orgCRUD = new OrganizationCRUD();
        Organization org = orgCRUD.getById(1L);
        System.out.println(org.getName());
        //Organization org = new Organization();
        //org.setId(5L);
        //org.setName("NewCompany");
        //orgCRUD.save(org);
    }

}
