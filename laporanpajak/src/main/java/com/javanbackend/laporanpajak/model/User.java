package com.javanbackend.laporanpajak.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user", schema = "public")
@EntityListeners({ AuditingEntityListener.class })
public class User {
    @Id
    @SequenceGenerator(name = "generator_userId", schema = "public", sequenceName = "user_id_user_seq", allocationSize = 1)
    @GeneratedValue(generator = "generator_userId", strategy = GenerationType.SEQUENCE)
    @Column(name = "user_id", nullable = false, unique = true, updatable = false)
    private Long userId;
    @Column(name = "email", length = 100)
    private String email;
    @Column(name = "user_role", length = 30)
    private String userRole;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_time", length = 29)
    private Date createdTime;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_modified_time", length = 29)
    private Date lastModifiedTime;
}