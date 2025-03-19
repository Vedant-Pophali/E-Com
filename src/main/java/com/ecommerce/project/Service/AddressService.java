package com.ecommerce.project.Service;

import com.ecommerce.project.Model.User;
import com.ecommerce.project.Payload.AddressDTO;

import java.util.List;

public interface AddressService {
    AddressDTO createAddress(AddressDTO addressDTO, User user);
    List<AddressDTO> getAddresses();
    AddressDTO getAddressesById(Long addressId);
    List<AddressDTO> getUserAddresses(User user);
    AddressDTO updateAddress(Long addressId, AddressDTO addressDTO);
    String deleteAddress(Long addressId);
}