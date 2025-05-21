package com.intensivaojavaspring.dslist.projections;

public interface GameMinProjection {
   Long getId();
   String getTitle();
   Integer getGameYear();
   String getImgUrl();
   String getShortDescription();
   Integer getPosition(); 
}
