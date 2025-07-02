package carcollection.dev.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired

    private CarRepository carRepo;

    //GetAll cars
    @GetMapping
    public List<car> getAllCars(){
        return carRepo.findAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<car> getCarById(@PathVariable int id) {
        Optional<car> anyCar = carRepo.findById(id);

        if (anyCar.isPresent()){
            car foundCar = anyCar.get();
            return new ResponseEntity<>(foundCar, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    //Add a car
    @PostMapping
    public car addCar(@RequestBody car newCar){
        return carRepo.save(newCar);
    }

    //Deleting a car
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCarById( @PathVariable int id){
        Optional<car> anyCar = carRepo.findById(id);
        //RecursiveCAll the above function to delete
        if (anyCar.isPresent()){
            carRepo.deleteById(id);
            return new ResponseEntity<>("car with ID " + id +
                    " has been deleted",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("car with ID " + id +
                    "is not found",HttpStatus.NOT_FOUND );
        }
    }
    //updating existing car with a new one
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCar( @PathVariable int id, @RequestBody car updateCar){
        Optional<car> anyCar = carRepo.findById(id);

        if(anyCar.isPresent()){
            car existingCar = anyCar.get();
            //UUpdate the anyFields now;
            existingCar.setBrand(updateCar.getBrand());
            existingCar.setName(updateCar.getName());
            existingCar.setYear(updateCar.getYear());

            carRepo.save(existingCar);
            return new ResponseEntity<>("car with ID "+ id
                    + " successfully updated",HttpStatus.OK);
        }else{
            return new ResponseEntity<>("car with ID "+ id +
                    " not found",HttpStatus.NOT_FOUND);
        }
    }

}
