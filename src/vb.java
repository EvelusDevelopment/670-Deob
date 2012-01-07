
final class vb extends RuntimeException {

   static int e;
   static int a = 0;
   static int c;
   static int f;
   static int g;
   static Object[] d = nea.a((byte)-35, new Object[1], 4);
   static int b;


   static final void a(int var0, Object[] var1) {
      ++e;
      if(var0 == '\u83f3') {
         if(null == var1[1]) {
            var1[1] = new int[1];
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      if(null != var0[0]) {
         ona.a((Object[])((Object[])var0[0]), var1 ^ 68);
      }

      if(var1 != -8) {
         a(true, false, 6, true, (ta)var0[5]);
      }

      ++c;
   }

   public vb() {
      super("");
   }

   static final void a(int var0) {
      goa.a = null;
      gba.r = null;
      aaa.a = null;
      om.g = null;
      ++g;
      tj.e = null;
      ws.A = null;
      rc.g = null;
      kta.j = null;
      vq.b = null;
      cna.f = null;
      int var1 = -100 % ((31 - var0) / 38);
   }

   static final Object[] a(boolean var0, boolean var1, int var2, boolean var3, ta var4) {
      ++f;
      if(-1 == var2) {
         return null;
      } else {
         if(null != aqa.n) {
            for(int var5 = 0; aqa.n.length > var5; ++var5) {
               if(var2 == aqa.n[var5]) {
                  return rt.g[var5];
               }
            }
         }

         Object[] var11 = (Object[])((Object[])dna.a((byte)34, np.f_i, (long)(var2 << 1 | (!var0?0:1))));
         if(var11 == null) {
            aea[] var12 = aea.a(oma.f, var2);
            if(var11 != null && var11.length == 5) {
               rt.g = (Object[][])null;
            }

            if(null != var12) {
               Object[] var7 = jh.a(var2, var3, uha.d);
               if(null == var7) {
                  return null;
               } else {
                  if(!var1) {
                     Object[] var9 = new Object[2];
                     ja var10 = var4.a(var7, var12, var0);
                     var9[0] = null;
                     var9[1] = null;
                     var9[1] = var10;
                     var11 = var9;
                  } else {
                     var11 = qh.a(new Object[2], 127, var7, var4.a(var7, var12, var0));
                  }

                  il.a((long)((var0?1:0) | var2 << 1), var11, true, np.f_i);
                  return var11;
               }
            } else {
               return null;
            }
         } else {
            if(var1 && null == var11[0]) {
               Object[] var6 = jh.a(var2, false, uha.d);
               if(null == var6) {
                  return null;
               }

               var11[0] = var6;
            }

            return var11;
         }
      }
   }

   static final int a(int var0, Object[] var1, Object[] var2) {
      ++b;
      int var3;
      if(var1 != vk.f) {
         if(var1 == vk.e) {
            var3 = ((int[])((int[])var2[0]))[1];
            if(var3 != 7) {
               if(var3 == 1) {
                  return '\u8d7b';
               } else if(var3 != 8) {
                  if(var3 != 5) {
                     if(4 != var3) {
                        if(9 == var3) {
                           return '\u8054';
                        } else {
                           throw new IllegalArgumentException();
                        }
                     } else {
                        return '\u803e';
                     }
                  } else {
                     return '\u8042';
                  }
               } else {
                  return '\u81a5';
               }
            } else {
               return '\u805b';
            }
         } else if(vk.b == var1) {
            var3 = ((int[])((int[])var2[0]))[1];
            if(var3 != 8) {
               throw new IllegalArgumentException();
            } else {
               return '\u81a6';
            }
         } else if(var1 == vk.f_i) {
            var3 = ((int[])((int[])var2[0]))[1];
            if(var3 == 7) {
               return '\u881a';
            } else if(var3 == 4) {
               return '\u881c';
            } else if(9 != var3) {
               if(var3 == 1) {
                  return '\u881f';
               } else if(var3 == 5) {
                  return '\u881e';
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return '\u881b';
            }
         } else if(var1 != vk.h) {
            if(var0 > -84) {
               return 98;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            var3 = ((int[])((int[])var2[0]))[1];
            if(1 == var3) {
               return '\u8819';
            } else if(4 == var3) {
               return '\u8816';
            } else if(5 != var3) {
               if(var3 == 7) {
                  return '\u8814';
               } else if(var3 == 9) {
                  return '\u8815';
               } else {
                  throw new IllegalArgumentException();
               }
            } else {
               return '\u8818';
            }
         }
      } else {
         var3 = ((int[])((int[])var2[0]))[1];
         if(7 != var3) {
            if(9 != var3) {
               if(4 == var3) {
                  return 6406;
               } else if(var3 == 2) {
                  return '\u83f1';
               } else if(var3 != 5) {
                  if(var3 != 6) {
                     if(1 != var3) {
                        throw new IllegalArgumentException();
                     } else {
                        return 6410;
                     }
                  } else {
                     return '\u83f3';
                  }
               } else {
                  return 6409;
               }
            } else {
               return 6407;
            }
         } else {
            return 6408;
         }
      }
   }

}
