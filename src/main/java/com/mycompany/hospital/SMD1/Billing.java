/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hospital.SMD1;

/**
 *
 * @author ADJI
 */

public class Billing{

 private int b_no=201;
 private int b_amt=1000000;
 Patient P = new Patient();
 String p_name =P.getP_name();
 int p_id = P.getP_id();
 
 public String getP_name() {
  return p_name;
 }
 public int getB_no() {
  return b_no;
 }
 public int getB_amt() {
  return b_amt;
 }
 public Patient getP() {
  return P;
 }
 public int getP_id() {
  return p_id;
 }
 
}