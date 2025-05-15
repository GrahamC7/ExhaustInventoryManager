package com.graham.exhaust.bootstrap;

import com.graham.exhaust.domain.InhousePart;
import com.graham.exhaust.domain.OutsourcedPart;
import com.graham.exhaust.domain.Product;
import com.graham.exhaust.repositories.InhousePartRepository;
import com.graham.exhaust.repositories.OutsourcedPartRepository;
import com.graham.exhaust.repositories.PartRepository;
import com.graham.exhaust.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;
    private final InhousePartRepository inHousePartRepository;
    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository,InhousePartRepository inhousePartRepository,OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.inHousePartRepository = inhousePartRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<InhousePart> inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();

        InhousePart inHousePart1 = new InhousePart();
        inHousePart1.setId(001);
        inHousePart1.setName("Axle-Back Exhaust");
        inHousePart1.setPrice(400.00);
        inHousePart1.setInv(10);
        inHousePart1.setMinInv(1);
        inHousePart1.setMaxInv(20);
        inHousePartRepository.save(inHousePart1);
        InhousePart thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Axle-Back Exhaust")) {}
        }

        InhousePart inHousePart2 = new InhousePart();
        inHousePart2.setId(002);
        inHousePart2.setName("Cat-Back Exhaust");
        inHousePart2.setPrice(900.00);
        inHousePart2.setInv(10);
        inHousePart2.setMinInv(1);
        inHousePart2.setMaxInv(20);
        inHousePartRepository.save(inHousePart2);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Cat-back Exhaust")) {}
        }

        InhousePart inHousePart3 = new InhousePart();
        inHousePart3.setId(003);
        inHousePart3.setName("Longtube Headers");
        inHousePart3.setPrice(600.00);
        inHousePart3.setInv(10);
        inHousePart3.setMinInv(1);
        inHousePart3.setMaxInv(20);
        inHousePartRepository.save(inHousePart3);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("Longtube Headers")) {}
        }

        InhousePart inHousePart4 = new InhousePart();
        inHousePart4.setId(004);
        inHousePart4.setName("X-Pipe");
        inHousePart4.setPrice(300.00);
        inHousePart4.setInv(10);
        inHousePart4.setMinInv(1);
        inHousePart4.setMaxInv(20);
        inHousePartRepository.save(inHousePart4);
        thePart = null;
        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            if(inhousePart.getName().equals("X-Pipe")) {}
        }

        inhouseParts = (List<InhousePart>) inHousePartRepository.findAll();
        for(InhousePart inhousePart : inhouseParts) {
            System.out.println(inhousePart.getName()+" "+inhousePart.getId());
        }

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();

        OutsourcedPart outsourcedPart1 = new OutsourcedPart();
        outsourcedPart1.setCompanyName("Summit Racing");
        outsourcedPart1.setId(005);
        outsourcedPart1.setName("High Flow Catalytic Converters");
        outsourcedPart1.setPrice(300.00);
        outsourcedPart1.setInv(10);
        outsourcedPart1.setMinInv(1);
        outsourcedPart1.setMaxInv(20);
        outsourcedPartRepository.save(outsourcedPart1);
        OutsourcedPart theOutsourcedPart = null;
        outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart outsourcedPart : outsourcedParts) {
            if(outsourcedPart.getName().equals("High Flow Catalytic Converters")) {
                theOutsourcedPart = outsourcedPart;
            }
        }

        // prints name of company where outsourced part is from
        System.out.println(theOutsourcedPart.getCompanyName());

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */

        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        // product packages
        Product fullexhaust = new Product("Full Exhaust Package",2100.0,20);
        Product catsToTips = new Product("Cats to Tips Package",1500.0,20);
        Product xpipeToTips = new Product("X-pipe to Tips",1200.0,20);
        Product freeFlow = new Product("Free Flow - Emissions Friendly Package",550.0,20);
        Product offRoadFreeFlow = new Product("Free Flow - Offroad Package ",1800.0,20);

        productRepository.save(fullexhaust);
        productRepository.save(catsToTips);
        productRepository.save(xpipeToTips);
        productRepository.save(freeFlow);
        productRepository.save(offRoadFreeFlow);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
