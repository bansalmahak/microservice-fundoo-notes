package com.bridgeit.label.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgeit.label.dTO.LabelDto;
import com.bridgeit.label.model.Labels;
import com.bridgeit.note.model.Notes;
import com.bridgeit.response.Response;

@Service
public interface IlabelService {
	public Response create(LabelDto label, String token) throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response update(LabelDto labell, String token, long id)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response delete(long id, String token) throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public List<Labels> getlabels(String token) throws IllegalArgumentException, UnsupportedEncodingException;

	
	public Response addnotetolabel(String token, long noteid, long labelid)
			throws IllegalArgumentException, UnsupportedEncodingException;

	public Response removenotetolabel(String token, long noteid, long labelid)
			throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Notes> getlistofnotes(String token, long labelid) throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	
}