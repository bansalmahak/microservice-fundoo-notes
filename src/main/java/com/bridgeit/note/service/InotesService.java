package com.bridgeit.note.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgeit.label.model.Labels;
import com.bridgeit.note.dTO.NotesDto;
import com.bridgeit.note.model.Notes;
import com.bridgeit.response.Response;

@Service
public interface InotesService {
	public Response create(NotesDto notesdto, String token)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response update(NotesDto notesdto, String token, long id)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response delete(long id, String token)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response isTrash(long id, String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public Response isPin(long id, String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public Response isArchive(long id, String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Notes> getnotes(String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public Response addlabeltonote(String token, long noteid, long labelid)
			throws IllegalArgumentException, UnsupportedEncodingException;

	public Response removelabeltonote(String token, long noteid, long labelid)
			throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Labels> getlistoflabel(String token, long noteid)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response setreminder(String token, String time, long noteid)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response removereminder(String token, long noteid)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response updatereminder(String token, String time, long noteid)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

	public Response addcolaborator(String token, long noteid, String emailid)
			throws IllegalArgumentException, UnsupportedEncodingException;

	public Response removecolaborator(String token, long noteid, String emailid)
			throws IllegalArgumentException, UnsupportedEncodingException;

//	public List<User> getlistofcollaborator(String token, long noteid)
//			throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Notes> getlistofarchieve(String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Notes> getlistoftrash(String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public List<Notes> getlistofpin(String token) throws IllegalArgumentException, UnsupportedEncodingException;

	public Response addcolor(String token, long noteid, String color)
			throws IllegalArgumentException, UnsupportedEncodingException, Exception;

//
//	Map<Object, Notes> getlistofnotefromredis();
//
//	Object getsinglenotefromredis(long id);

}
