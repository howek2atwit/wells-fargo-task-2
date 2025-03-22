package com.example.wellsfargo.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class FinancialAdvisor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany(mappedBy = "advisor", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Client> clients;

    public FinancialAdvisor(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public FinancialAdvisor() {}

    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public Set<Client> getClients() { return clients; }
    public void setClients(Set<Client> clients) { this.clients = clients; }
}
