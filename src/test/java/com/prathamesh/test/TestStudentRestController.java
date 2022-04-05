package com.prathamesh.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

//@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
//@AutoConfigureMockMvc
//@TestPropertySource("classpath:application.properties")
public class TestStudentRestController {

	/*
	 * @Autowired private MockMvc mockMvc;
	 * 
	 * @Test
	 * 
	 * @Disabled public void testSaveStudent() throws Exception {
	 * MockHttpServletRequestBuilder request =
	 * MockMvcRequestBuilders.post("/student/getonestudent/103")
	 * .contentType(MediaType.APPLICATION_JSON)
	 * .content("{\"empId\":111,\"empName\":\"Rod\",\"empDept\":\"Elec\"}");
	 * 
	 * MvcResult result = mockMvc.perform(request).andReturn();
	 * MockHttpServletResponse response = result.getResponse();
	 * assertEquals(HttpStatus.OK.value() , response.getStatus());
	 * if(!response.getContentAsString().contains("saved")) { fail(); } }
	 * 
	 * @Test
	 * 
	 * @Disabled public void testGetAllStudents() throws Exception {
	 * MockHttpServletRequestBuilder request =
	 * MockMvcRequestBuilders.get("/student/getallstudents"); MvcResult result =
	 * mockMvc.perform(request).andReturn(); MockHttpServletResponse response =
	 * result.getResponse(); assertEquals(HttpStatus.OK.value(),
	 * response.getStatus()); assertEquals("application/json",
	 * response.getContentType()); String responseBody =
	 * response.getContentAsString(); if(responseBody==null ||
	 * responseBody.length()==0) { fail(); } }
	 */
	
}
