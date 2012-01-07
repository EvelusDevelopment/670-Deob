
final class pe {

   static Object[] f = ho.a(7, 24, new Object[1], true);
   static int b;
   static int d;
   static int e;
   static int g;
   static int c;
   static int a;


   static final Object[] a(int var0, Object[] var1, Object[] var2) {
      if(null == var1[1]) {
         var1[1] = new boolean[2];
      }

      ++b;
      if(var0 > -44) {
         a(new Object[7], false, -112);
      }

      gma.a(var2, -94, var1);
      return var1;
   }

   static final void a(byte var0, Object[] var1, int var2, int var3, int var4) {
      if(null != var1 && var1.length == 3) {
         fla.a = (Object[])((Object[])qn.g[8]);
      }

      if(var0 != -119) {
         a(((int[])((int[])var1[2]))[16], -97, (Object[])null, -55, (byte)-50, 30, 87, -24, 99);
      }

      ++d;

      tda var5;
      tda var6;
      for(Object[] var8 = (var5 = (tda)dda.a(fla.a, 2)) == null?null:var5.f_l; var8 != null; var8 = null != (var6 = (tda)client.a(fla.a, -28280))?var6.f_l:null) {
         if(~var3 == ~((int[])((int[])var8[1]))[8] && var4 << 9 == ((int[])((int[])var8[1]))[10] && ~(var2 << 9) == ~((int[])((int[])var8[1]))[5] && ((int[])((int[])((Object[])((Object[])var8[9]))[1]))[13] == ((int[])((int[])var1[1]))[13]) {
            if(null != var8[6]) {
               ah.d.b((kp)var8[6]);
               var8[6] = null;
            }

            if(null != var8[0]) {
               ah.d.b((kp)var8[0]);
               var8[0] = null;
            }

            ((lm)(null != var8?var8[11]:null)).a((byte)60);
            return;
         }
      }

   }

   static final int a(Object[] var0, boolean var1, int var2) {
      if(var1) {
         ((long[])((long[])var0[0]))[14] = 96L;
      }

      ++g;
      int var3 = -1 + (((int[])((int[])var0[0])).length >> 1);
      int var4 = var2 & var3;

      while(true) {
         int var5 = ((int[])((int[])var0[0]))[1 + var4 + var4];
         if(-1 == var5) {
            return -1;
         }

         if(((int[])((int[])var0[0]))[var4 + var4] == var2) {
            return var5;
         }

         var4 = var4 + 1 & var3;
      }
   }

   static final Object[] a(int var0, int var1, boolean var2, int var3, Object[] var4, int var5, int var6, int var7) {
      if(var2) {
         return (Object[])null;
      } else {
         ++a;
         return ((boolean[])((boolean[])var4[17]))[4]?eh.a(var6, var7, var4, var5, var1, var3, (byte)-91, var0, new Object[3]):null;
      }
   }

   static final boolean a(int var0, int var1, Object[] var2, int var3, byte var4, int var5, int var6, int var7, int var8) {
      ++c;
      if(1 != var8) {
         if(var0 >= var6 && var0 <= -1 + var6 + var8 && var3 >= var3 && var3 - (-var8 + 1) >= var3) {
            return true;
         }
      } else if(var0 == var6 && var7 == var3) {
         return true;
      }

      var3 -= ((int[])((int[])var2[1]))[0];
      int var9 = -111 / ((46 - var4) / 55);
      var7 -= ((int[])((int[])var2[1]))[0];
      var6 -= ((int[])((int[])var2[1]))[2];
      var0 -= ((int[])((int[])var2[1]))[2];
      if(var8 != 1) {
         int var10 = -1 + var6 + var8;
         int var11 = -1 + var8 + var7;
         if(var1 == 0) {
            if(0 == var5) {
               if(~var6 == ~(var0 - var8) && var3 >= var7 && var3 <= var11) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && 1 + var3 == var7 && (2883872 & ((int[][])((int[][])var2[0]))[var0][var7]) == 0) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && var7 == var3 + -var8 && (2883842 & ((int[][])((int[][])var2[0]))[var0][var11]) == 0) {
                  return true;
               }
            } else if(1 == var5) {
               if(var6 <= var0 && var10 >= var0 && var3 - -1 == var7) {
                  return true;
               }

               if(var0 + -var8 == var6 && var3 >= var7 && var11 >= var3 && (2883848 & ((int[][])((int[][])var2[0]))[var10][var3]) == 0) {
                  return true;
               }

               if(var0 + 1 == var6 && var7 <= var3 && var3 <= var11 && (((int[][])((int[][])var2[0]))[var6][var3] & 2883968) == 0) {
                  return true;
               }
            } else if(var5 != 2) {
               if(var5 == 3) {
                  if(var0 >= var6 && var10 >= var0 && var3 - var8 == var7) {
                     return true;
                  }

                  if(var0 - var8 == var6 && var3 >= var7 && var11 >= var3 && (2883848 & ((int[][])((int[][])var2[0]))[var10][var3]) == 0) {
                     return true;
                  }

                  if(~var6 == ~(1 + var0) && var3 >= var7 && var11 >= var3 && (((int[][])((int[][])var2[0]))[var6][var3] & 2883968) == 0) {
                     return true;
                  }
               }
            } else {
               if(~var6 == ~(1 + var0) && var3 >= var7 && var11 >= var3) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && var7 == 1 + var3 && 0 == (2883872 & ((int[][])((int[][])var2[0]))[var0][var7])) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && -var8 + var3 == var7 && (2883842 & ((int[][])((int[][])var2[0]))[var0][var11]) == 0) {
                  return true;
               }
            }
         }

         if(var1 == 2) {
            if(var5 == 0) {
               if(var6 == -var8 + var0 && var7 <= var3 && var11 >= var3) {
                  return true;
               }

               if(var6 <= var0 && var0 <= var10 && ~var7 == ~(var3 + 1)) {
                  return true;
               }

               if(var0 + 1 == var6 && var3 >= var7 && var3 <= var11 && (2883968 & ((int[][])((int[][])var2[0]))[var6][var3]) == 0) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && ~var7 == ~(-var8 + var3) && (2883842 & ((int[][])((int[][])var2[0]))[var0][var11]) == 0) {
                  return true;
               }
            } else if(1 != var5) {
               if(2 == var5) {
                  if(-var8 + var0 == var6 && var7 <= var3 && var3 <= var11 && (((int[][])((int[][])var2[0]))[var10][var3] & 2883848) == 0) {
                     return true;
                  }

                  if(var0 >= var6 && var0 <= var10 && var7 == var3 + 1 && (((int[][])((int[][])var2[0]))[var0][var7] & 2883872) == 0) {
                     return true;
                  }

                  if(1 + var0 == var6 && var3 >= var7 && var11 >= var3) {
                     return true;
                  }

                  if(var0 >= var6 && var10 >= var0 && ~var7 == ~(var3 + -var8)) {
                     return true;
                  }
               } else if(var5 == 3) {
                  if(var0 - var8 == var6 && var7 <= var3 && var3 <= var11) {
                     return true;
                  }

                  if(var6 <= var0 && var10 >= var0 && var7 == 1 + var3 && -1 == ~(2883872 & ((int[][])((int[][])var2[0]))[var0][var7])) {
                     return true;
                  }

                  if(var0 + 1 == var6 && var7 <= var3 && var3 <= var11 && 0 == (((int[][])((int[][])var2[0]))[var6][var3] & 2883968)) {
                     return true;
                  }

                  if(var0 >= var6 && var0 <= var10 && var3 - var8 == var7) {
                     return true;
                  }
               }
            } else {
               if(-var8 + var0 == var6 && var3 >= var7 && var3 <= var11 && (((int[][])((int[][])var2[0]))[var10][var3] & 2883848) == 0) {
                  return true;
               }

               if(var6 <= var0 && var10 >= var0 && 1 + var3 == var7) {
                  return true;
               }

               if(var0 + 1 == var6 && var7 <= var3 && var11 >= var3) {
                  return true;
               }

               if(var0 >= var6 && var10 >= var0 && -var8 + var3 == var7 && (2883842 & ((int[][])((int[][])var2[0]))[var0][var11]) == 0) {
                  return true;
               }
            }
         }

         if(var1 == 9) {
            if(var0 >= var6 && var10 >= var0 && var7 == 1 + var3 && 0 == (2883872 & ((int[][])((int[][])var2[0]))[var0][var7])) {
               return true;
            }

            if(var0 >= var6 && var10 >= var0 && var7 == -var8 + var3 && (2883842 & ((int[][])((int[][])var2[0]))[var0][var11]) == 0) {
               return true;
            }

            if(var0 - var8 == var6 && var3 >= var7 && var3 <= var11 && 0 == (2883848 & ((int[][])((int[][])var2[0]))[var10][var3])) {
               return true;
            }

            if(var6 == var0 + 1 && var7 <= var3 && var11 >= var3 && (2883968 & ((int[][])((int[][])var2[0]))[var6][var3]) == 0) {
               return true;
            }
         }
      } else {
         if(var1 == 0) {
            if(var5 != 0) {
               if(var5 != 1) {
                  if(2 != var5) {
                     if(var5 == 3) {
                        if(var6 == var0 && -1 + var3 == var7) {
                           return true;
                        }

                        if(var6 == var0 - 1 && var7 == var3 && -1 == ~(2883848 & ((int[][])((int[][])var2[0]))[var6][var7])) {
                           return true;
                        }

                        if(~var6 == ~(1 + var0) && var3 == var7 && (((int[][])((int[][])var2[0]))[var6][var7] & 2883968) == 0) {
                           return true;
                        }
                     }
                  } else {
                     if(1 + var0 == var6 && var7 == var3) {
                        return true;
                     }

                     if(var6 == var0 && 1 + var3 == var7 && -1 == ~(((int[][])((int[][])var2[0]))[var6][var7] & 2883872)) {
                        return true;
                     }

                     if(var0 == var6 && -1 + var3 == var7 && -1 == ~(((int[][])((int[][])var2[0]))[var6][var7] & 2883842)) {
                        return true;
                     }
                  }
               } else {
                  if(var6 == var0 && 1 + var3 == var7) {
                     return true;
                  }

                  if(var0 - 1 == var6 && var7 == var3 && -1 == ~(((int[][])((int[][])var2[0]))[var6][var7] & 2883848)) {
                     return true;
                  }

                  if(~var6 == ~(1 + var0) && var3 == var7 && (((int[][])((int[][])var2[0]))[var6][var7] & 2883968) == 0) {
                     return true;
                  }
               }
            } else {
               if(var6 == -1 + var0 && var3 == var7) {
                  return true;
               }

               if(var0 == var6 && ~var7 == ~(var3 + 1) && (2883872 & ((int[][])((int[][])var2[0]))[var6][var7]) == 0) {
                  return true;
               }

               if(var0 == var6 && -1 + var3 == var7 && 0 == (((int[][])((int[][])var2[0]))[var6][var7] & 2883842)) {
                  return true;
               }
            }
         }

         if(2 == var1) {
            if(var5 == 0) {
               if(var0 - 1 == var6 && var7 == var3) {
                  return true;
               }

               if(var6 == var0 && 1 + var3 == var7) {
                  return true;
               }

               if(~var6 == ~(1 + var0) && var7 == var3 && -1 == ~(2883968 & ((int[][])((int[][])var2[0]))[var6][var7])) {
                  return true;
               }

               if(var6 == var0 && var3 - 1 == var7 && 0 == (((int[][])((int[][])var2[0]))[var6][var7] & 2883842)) {
                  return true;
               }
            } else if(1 != var5) {
               if(var5 != 2) {
                  if(var5 == 3) {
                     if(var0 - 1 == var6 && var7 == var3) {
                        return true;
                     }

                     if(var0 == var6 && var7 == var3 - -1 && (((int[][])((int[][])var2[0]))[var6][var7] & 2883872) == 0) {
                        return true;
                     }

                     if(var6 == 1 + var0 && var3 == var7 && 0 == (2883968 & ((int[][])((int[][])var2[0]))[var6][var7])) {
                        return true;
                     }

                     if(var0 == var6 && var3 + -1 == var7) {
                        return true;
                     }
                  }
               } else {
                  if(var0 - 1 == var6 && var3 == var7 && (2883848 & ((int[][])((int[][])var2[0]))[var6][var7]) == 0) {
                     return true;
                  }

                  if(var6 == var0 && 1 + var3 == var7 && (((int[][])((int[][])var2[0]))[var6][var7] & 2883872) == 0) {
                     return true;
                  }

                  if(var0 + 1 == var6 && var3 == var7) {
                     return true;
                  }

                  if(var6 == var0 && -1 + var3 == var7) {
                     return true;
                  }
               }
            } else {
               if(var0 - 1 == var6 && var3 == var7 && (((int[][])((int[][])var2[0]))[var6][var7] & 2883848) == 0) {
                  return true;
               }

               if(var0 == var6 && var7 == 1 + var3) {
                  return true;
               }

               if(var6 == var0 + 1 && var7 == var3) {
                  return true;
               }

               if(var0 == var6 && var7 == var3 - 1 && (2883842 & ((int[][])((int[][])var2[0]))[var6][var7]) == 0) {
                  return true;
               }
            }
         }

         if(9 == var1) {
            if(var0 == var6 && var3 + 1 == var7 && 0 == (((int[][])((int[][])var2[0]))[var6][var7] & 32)) {
               return true;
            }

            if(var6 == var0 && var7 == var3 + -1 && (((int[][])((int[][])var2[0]))[var6][var7] & 2) == 0) {
               return true;
            }

            if(var6 == var0 - 1 && var7 == var3 && (((int[][])((int[][])var2[0]))[var6][var7] & 8) == 0) {
               return true;
            }

            if(var6 == 1 + var0 && var7 == var3 && (((int[][])((int[][])var2[0]))[var6][var7] & 128) == 0) {
               return true;
            }
         }
      }

      return false;
   }

}
