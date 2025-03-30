package com.ecommerce.project.Controller;

import com.ecommerce.project.Model.User;
import com.ecommerce.project.Payload.AddressDTO;
import com.ecommerce.project.Service.AddressService;
import com.ecommerce.project.Util.AuthUtil;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AddressController{
    @Autowired
    AuthUtil authUtil;
    @Autowired
    AddressService addressService;

    @PostMapping("/addresses")
     public ResponseEntity<AddressDTO> createAddress(@Valid @RequestBody AddressDTO addressDTO){
        User user = authUtil.loggedInUser();
        AddressDTO savedAddressDTO = addressService.createAddress(addressDTO,user);
        return new ResponseEntity<>(savedAddressDTO, HttpStatus.CREATED);
    }

    @GetMapping("/addresses")
     public ResponseEntity<List<AddressDTO>> getAddress(){
        List<AddressDTO> addressDTOList = addressService.getAddress( );
        return new ResponseEntity<>(addressDTOList, HttpStatus.OK);
    }

    @GetMapping("/addresses/{addressId}")
     public ResponseEntity<AddressDTO> getAddressesById(@PathVariable Long addressId){
        AddressDTO addressDTO =   addressService.getAddressesById(addressId);
        return new ResponseEntity<>(addressDTO,HttpStatus.OK);
     }

    @GetMapping("/users/addresses")
     public ResponseEntity<List<AddressDTO>> getUserAddresses(){
        User user = authUtil.loggedInUser();
        List<AddressDTO> addressDTOList = addressService.getUserAddresses(user);
        return new ResponseEntity<>(addressDTOList, HttpStatus.OK);
     }

     @PutMapping("/addresses/{addressId}")
     public ResponseEntity<AddressDTO> updateAddress(@PathVariable Long addressId,
                                                     @RequestBody AddressDTO addressDTO){
        AddressDTO updatedAddress = addressService.updateAddress(addressId,addressDTO);
        return new ResponseEntity<>(updatedAddress,HttpStatus.OK);
     }

     @DeleteMapping("/addresses/{addressId}")
      public ResponseEntity<String> deleteAddress(@PathVariable Long addressId){
        String status = addressService.deleteAddress(addressId );
         return new ResponseEntity<>(status,HttpStatus.OK);
    }
}