package com.codespiral.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.codespiral.model.Customer;
import com.codespiral.services.CustomerService;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

	@Autowired
	private MockMvc mockMvc; 

	@MockBean
	private CustomerService customerService; 
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void contextLoad() throws Exception {
		assertNotNull(customerService);
	}

	@Test
	public void doGetCustomer() throws Exception {
		List<Customer> customers = null;
		when(customerService.findAllCustomer()).thenReturn(customers);
		this.mockMvc.perform(get("/customers"))
			.andDo(print())
			.andExpect(status().isOk());
		verify(customerService, times(1)).findAllCustomer();
	}

}