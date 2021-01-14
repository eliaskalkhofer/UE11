/**
 * @class: Cardatabase
 * @author: Elias Kalkhofer
 * @date: 14.01.2021
 */

package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Cardatabase {
    protected HashMap<String, Vehicle> db = new HashMap();

    public Cardatabase() {
        for(int i = 0; i < 1000; ++i) {
            MagicGenerator magGen = new MagicGenerator();
            Vehicle vehicl = new Vehicle();
            vehicl.setColor(magGen.getRandomColor());
            vehicl.setOwner(magGen.getRandomName());
            vehicl.setManufacturer(magGen.getRandomManufacturer());
            vehicl.setModel(magGen.getRandomModel(magGen.getRandomManufacturer()));
            vehicl.setLicensePlate(magGen.getRandomLicencePlate());
            this.db.put(vehicl.getLicensePlate(), vehicl);
            System.out.println("Created vehicle with license plate " + vehicl.getLicensePlate());
        }

    }

    public Vehicle[] search(String licensePlate, boolean exact) {
        long start = System.nanoTime();
        Vehicle[] vehicle;
        if (exact) {
            vehicle = new Vehicle[]{(Vehicle)this.db.get(licensePlate)};
        } else {
            Iterator<String> iter = this.db.keySet().iterator();
            ArrayList vehicle2 = new ArrayList();

            while(iter.hasNext()) {
                Vehicle vehicle1 = (Vehicle)this.db.get(iter.next());
                if (vehicle1.getLicensePlate().contains(licensePlate)) {
                    vehicle2.add(vehicle1);
                }
            }

            vehicle = new Vehicle[vehicle2.size()];

            for(int i = 0; i < vehicle2.size(); ++i) {
                vehicle[i] = (Vehicle)vehicle2.get(i);
            }
        }

        long ende = System.nanoTime();
        long diff = ende - start;
        System.out.println(diff);
        return vehicle;
    }
}