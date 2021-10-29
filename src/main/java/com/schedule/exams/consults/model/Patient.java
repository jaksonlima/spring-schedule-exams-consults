package com.schedule.exams.consults.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "JWS_PATIENT")
public class Patient {

  @Id
  @Column(name = "ID")
  private Integer id;

  @Column(name = "NOME")
  private String nome;

  @Column(name = "DATA_NASCIMENTO")
  private String dataNascimento;

  @Column(name = "CPF")
  private String cpf;

  @Column(name = "RG")
  private String rg;

}
