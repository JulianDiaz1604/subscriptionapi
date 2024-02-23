package co.edu.uco.subscriptionapi.domain.person;

import java.util.UUID;

public class Person {

    private UUID id;
    private String name;
    private String lastName;
    private float mobileNumber;
    private String documentType;
    private float identityDocument;
    private String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(float mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public float getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(float identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", mobileNumber=" + mobileNumber +
                ", documentType='" + documentType + '\'' +
                ", identityDocument=" + identityDocument +
                ", email='" + email + '\'' +
                '}';
    }
}