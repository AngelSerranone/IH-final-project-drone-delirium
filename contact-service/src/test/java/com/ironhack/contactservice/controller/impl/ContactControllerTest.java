package com.ironhack.contactservice.controller.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ironhack.contactservice.controller.dto.ContactDto;
import com.ironhack.contactservice.repository.ContactRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
class ContactControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private ContactRepository contactRepository;

    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @BeforeEach
    void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @AfterEach
    void tearDown() {
        contactRepository.deleteAll();
    }

    @Test
    void storeContact_validDto_storedContact() throws Exception {
        ContactDto contactDto = new ContactDto();
        contactDto.setName("Pedro");
        contactDto.setLastName("Picapiedra");
        contactDto.setTelephoneNumber("654789123");
        contactDto.setEmail("pedro@picapiedra.pica");
        contactDto.setMessage("Abre la puerta Vilma");

        String body = objectMapper.writeValueAsString(contactDto);
        MvcResult result = mockMvc.perform(
                post("/add-contact")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated()).andReturn();
        assertTrue(result.getResponse().getContentAsString().contains("Pedro"));
    }

    @Test
    void storeContact_invalidDto_noStoredContact() throws Exception {
        ContactDto contactDto = new ContactDto();
        contactDto.setName("Pedro");
        contactDto.setEmail("pedro@picapiedra.pica");
        contactDto.setMessage("Abre la puerta Vilma");

        String body = objectMapper.writeValueAsString(contactDto);
        MvcResult result = mockMvc.perform(
                post("/add-contact")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest()).andReturn();
    }

    @Test
    void sendEmail_validDto_sendMail() throws Exception {
        ContactDto contactDto = new ContactDto();
        contactDto.setName("Pedro");
        contactDto.setLastName("Picapiedra");
        contactDto.setTelephoneNumber("654789123");
        contactDto.setEmail("pedro@picapiedra.pica");
        contactDto.setMessage("Abre la puerta Vilma");

        String body = objectMapper.writeValueAsString(contactDto);
        MvcResult result = mockMvc.perform(
                post("/send-mail")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isCreated()).andReturn();
        assertTrue(result.getResponse().getContentAsString().contains("true"));
    }

    @Test
    void sendEmail_invalidDto_noSendMail() throws Exception {
        ContactDto contactDto = new ContactDto();
        contactDto.setName("Pedro");
        contactDto.setLastName("Picapiedra");
        contactDto.setTelephoneNumber("654789123");
        contactDto.setMessage("Abre la puerta Vilma");

        String body = objectMapper.writeValueAsString(contactDto);
        MvcResult result = mockMvc.perform(
                post("/send-mail")
                        .content(body)
                        .contentType(MediaType.APPLICATION_JSON)
        ).andExpect(status().isBadRequest()).andReturn();
    }
}