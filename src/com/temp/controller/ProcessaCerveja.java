package com.temp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.temp.model.Cervejas;

public class ProcessaCerveja extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        
        String tipoCerveja = request.getParameter("tiposdecerveja");
        
        //System.out.println(request.getParameter("tiposdevinho"));
        
        Cervejas cerveja = new Cervejas();
        
        if(tipoCerveja .equals("americanlager")){
        	cerveja.setVinho1("Budweiser  ");
        	cerveja.setVinho2("Coors  ");
        	cerveja.setVinho3("Foster's  ");
        }
        
        if(tipoCerveja .equals("darkamericanlager")){
        	cerveja.setVinho1("Warsteiner Dunkel  ");
        	cerveja.setVinho2("Budweiser Budvar Premium Dark Lager  ");
        	cerveja.setVinho3("Zlato Prazske Dark Lager  ");
        }
        
        if(tipoCerveja .equals("premiumlager")){
        	cerveja.setVinho1("Stella Artois  ");
        	cerveja.setVinho2("Heineken  ");
        	cerveja.setVinho3("Sangue de Boi  ");
        }
        
        if(tipoCerveja .equals("pilsner")){
        	cerveja.setVinho1("Pilsner Urquell  ");
        	cerveja.setVinho2("Budweiser Budvar  ");
        	cerveja.setVinho3("Bitburger  ");
        }
        
        if(tipoCerveja .equals("malzbier")){
        	cerveja.setVinho1("Brahma Malzbier");
        	cerveja.setVinho2("Antarctica Malzbier");
        	cerveja.setVinho3("NovaSchin Malzbier");
        }
        
        if(tipoCerveja .equals("imperialipa")){
        	cerveja.setVinho1("Rogue XS Imperial India Pale Ale");
        	cerveja.setVinho2("Russian River Pliny the Elder");
        	cerveja.setVinho3("BrewDog Hardcore IPA");
        }
        
        if(tipoCerveja .equals("brasileiras")){
        	cerveja.setVinho1("Itaipava");
        	cerveja.setVinho2("Brahma");
        	cerveja.setVinho3("Skol");
        }
        
       request.setAttribute("cervejas", cerveja);
                   
       RequestDispatcher dispatcher =request.getRequestDispatcher("saida.jsp");
       dispatcher.forward(request, response);   
}
}
