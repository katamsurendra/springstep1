package com.stackroute.keepnote.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * The class "Note" will be acting as the data model for the Note data in the ArrayList.
 */
public class Note {
	private String noteTitle;
	private String noteContent;
	private String noteStatus;
	private LocalDateTime createdAt;
	

	private int noteId;
	public int getNoteId() {
		return noteId;
	}
	public Note(int noteId, String noteTitle, String noteContent, String noteStatus, LocalDateTime createdAt) {
		super();
		this.noteId = noteId;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.createdAt = createdAt;
	}
	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", noteStatus="
				+ noteStatus + ", createdAt=" + createdAt + "]";
	}
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt() {
		this.createdAt = createdAt.now();
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public String getNoteStatus() {
		return noteStatus;
	}
	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}
	
	
	/*
	 * This class should have five fields (noteId, noteTitle, noteContent,
	 * noteStatus and createdAt). This class should also contain the getters and
	 * setters for the fields. The value of createdAt should not be accepted from
	 * the user but should be always initialized with the system date
	 */

}