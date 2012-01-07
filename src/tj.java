import java.awt.Color;

final class tj {

   static cga e;
   static int f_i;
   static Color[] f = new Color[]{new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650)};
   static int b;
   static int c;
   static int h;
   static boolean j = false;
   private Object[] a;
   static int g;
   static int d;


   static final void a(Object[] var0, boolean var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      var3 -= ((int[])((int[])var0[1]))[0];
      var2 -= ((int[])((int[])var0[1]))[2];
      ++f_i;
      if(0 == var6) {
         if(0 == var5) {
            vt.a(32, var2, var0, var3, 128);
            vt.a(32, var2 - 1, var0, var3, 8);
         }

         if(var5 == 1) {
            vt.a(32, var2, var0, var3, 2);
            vt.a(32, var2, var0, 1 + var3, 32);
         }

         if(2 == var5) {
            vt.a(32, var2, var0, var3, 8);
            vt.a(32, 1 + var2, var0, var3, 128);
         }

         if(3 == var5) {
            vt.a(32, var2, var0, var3, 32);
            vt.a(32, var2, var0, var3 - 1, 2);
         }
      }

      if(1 == var6 || var6 == 3) {
         if(var5 == 0) {
            vt.a(32, var2, var0, var3, 1);
            vt.a(32, -1 + var2, var0, 1 + var3, 16);
         }

         if(1 == var5) {
            vt.a(32, var2, var0, var3, 4);
            vt.a(32, 1 + var2, var0, var3 + 1, 64);
         }

         if(var5 == 2) {
            vt.a(32, var2, var0, var3, 16);
            vt.a(32, var2 + 1, var0, -1 + var3, 1);
         }

         if(var5 == 3) {
            vt.a(32, var2, var0, var3, 64);
            vt.a(32, -1 + var2, var0, var3 - 1, 4);
         }
      }

      if(var4 == 21727) {
         if(var6 == 2) {
            if(var5 == 0) {
               vt.a(32, var2, var0, var3, 130);
               vt.a(32, -1 + var2, var0, var3, 8);
               vt.a(32, var2, var0, var3 + 1, 32);
            }

            if(1 == var5) {
               vt.a(32, var2, var0, var3, 10);
               vt.a(32, var2, var0, var3 + 1, 32);
               vt.a(32, 1 + var2, var0, var3, 128);
            }

            if(2 == var5) {
               vt.a(32, var2, var0, var3, 40);
               vt.a(32, var2 + 1, var0, var3, 128);
               vt.a(32, var2, var0, var3 - 1, 2);
            }

            if(3 == var5) {
               vt.a(32, var2, var0, var3, 160);
               vt.a(32, var2, var0, -1 + var3, 2);
               vt.a(32, var2 - 1, var0, var3, 8);
            }
         }

         if(var7) {
            if(0 == var6) {
               if(var5 == 0) {
                  vt.a(32, var2, var0, var3, 65536);
                  vt.a(32, var2 - 1, var0, var3, 4096);
               }

               if(1 == var5) {
                  vt.a(32, var2, var0, var3, 1024);
                  vt.a(32, var2, var0, 1 + var3, 16384);
               }

               if(var5 == 2) {
                  vt.a(32, var2, var0, var3, 4096);
                  vt.a(32, 1 + var2, var0, var3, 65536);
               }

               if(var5 == 3) {
                  vt.a(32, var2, var0, var3, 16384);
                  vt.a(32, var2, var0, var3 - 1, 1024);
               }
            }

            if(1 == var6 || var6 == 3) {
               if(0 == var5) {
                  vt.a(32, var2, var0, var3, 512);
                  vt.a(32, var2 - 1, var0, 1 + var3, 8192);
               }

               if(1 == var5) {
                  vt.a(32, var2, var0, var3, 2048);
                  vt.a(32, 1 + var2, var0, var3 + 1, '\u8000');
               }

               if(var5 == 2) {
                  vt.a(32, var2, var0, var3, 8192);
                  vt.a(32, var2 + 1, var0, var3 - 1, 512);
               }

               if(3 == var5) {
                  vt.a(32, var2, var0, var3, '\u8000');
                  vt.a(32, -1 + var2, var0, var3 - 1, 2048);
               }
            }

            if(var6 == 2) {
               if(var5 == 0) {
                  vt.a(32, var2, var0, var3, 66560);
                  vt.a(32, -1 + var2, var0, var3, 4096);
                  vt.a(32, var2, var0, 1 + var3, 16384);
               }

               if(1 == var5) {
                  vt.a(32, var2, var0, var3, 5120);
                  vt.a(32, var2, var0, var3 + 1, 16384);
                  vt.a(32, 1 + var2, var0, var3, 65536);
               }

               if(var5 == 2) {
                  vt.a(32, var2, var0, var3, 20480);
                  vt.a(32, var2 + 1, var0, var3, 65536);
                  vt.a(32, var2, var0, var3 - 1, 1024);
               }

               if(3 == var5) {
                  vt.a(32, var2, var0, var3, 81920);
                  vt.a(32, var2, var0, -1 + var3, 1024);
                  vt.a(32, var2 - 1, var0, var3, 4096);
               }
            }
         }

         if(var1) {
            if(0 == var6) {
               if(var5 == 0) {
                  vt.a(32, var2, var0, var3, 536870912);
                  vt.a(32, var2 - 1, var0, var3, 33554432);
               }

               if(var5 == 1) {
                  vt.a(32, var2, var0, var3, 8388608);
                  vt.a(32, var2, var0, var3 + 1, 134217728);
               }

               if(var5 == 2) {
                  vt.a(32, var2, var0, var3, 33554432);
                  vt.a(32, 1 + var2, var0, var3, 536870912);
               }

               if(var5 == 3) {
                  vt.a(32, var2, var0, var3, 134217728);
                  vt.a(32, var2, var0, -1 + var3, 8388608);
               }
            }

            if(1 == var6 || var6 == 3) {
               if(var5 == 0) {
                  vt.a(32, var2, var0, var3, 4194304);
                  vt.a(32, var2 - 1, var0, var3 + 1, 67108864);
               }

               if(1 == var5) {
                  vt.a(32, var2, var0, var3, 16777216);
                  vt.a(32, 1 + var2, var0, 1 + var3, 268435456);
               }

               if(2 == var5) {
                  vt.a(32, var2, var0, var3, 67108864);
                  vt.a(32, 1 + var2, var0, -1 + var3, 4194304);
               }

               if(3 == var5) {
                  vt.a(32, var2, var0, var3, 268435456);
                  vt.a(32, -1 + var2, var0, var3 - 1, 16777216);
               }
            }

            if(2 == var6) {
               if(0 == var5) {
                  vt.a(32, var2, var0, var3, 545259520);
                  vt.a(32, var2 - 1, var0, var3, 33554432);
                  vt.a(32, var2, var0, var3 + 1, 134217728);
               }

               if(var5 == 1) {
                  vt.a(32, var2, var0, var3, 41943040);
                  vt.a(32, var2, var0, var3 + 1, 134217728);
                  vt.a(32, var2 + 1, var0, var3, 536870912);
               }

               if(var5 == 2) {
                  vt.a(32, var2, var0, var3, 167772160);
                  vt.a(32, var2 + 1, var0, var3, 536870912);
                  vt.a(32, var2, var0, -1 + var3, 8388608);
               }

               if(var5 == 3) {
                  vt.a(32, var2, var0, var3, 671088640);
                  vt.a(32, var2, var0, var3 - 1, 8388608);
                  vt.a(32, var2 - 1, var0, var3, 33554432);
               }
            }
         }

      }
   }

   static final void a(Object[] var0, byte var1) {
      if(((int[])((int[])var0[1]))[0] != 1 && ((int[])((int[])var0[1]))[0] != 0) {
         int[] var2 = (int[])((int[])var0[1]);
         byte var3 = 1;
         var2[0] = var3;
      }

      ++b;
      if(var1 <= 98) {
         a((Object[])null, (byte)52);
      }

   }

   static final int a(Object[] var0, int var1) {
      if(var1 != -21891) {
         a((Object[])((Object[])var0[21]), (byte)-10);
      }

      ++h;
      return ((int[])((int[])var0[1]))[2];
   }

   tj(Object[] var1) {
      this.a = var1;
   }

   static final fha a(int var0, Object[] var1) {
      ++c;
      return var0 != 8?(fha)null:new fha(var1);
   }

   public final String toString() {
      ++g;
      Object[] var2 = this.a;
      String var1 = "" + ((int[])((int[])var2[1]))[1];
      return var1;
   }

   static final Object[] a(int var0, int var1, Object[] var2, byte var3, Object[] var4, int var5, Object[] var6) {
      ++d;
      if(var3 >= -126) {
         var4[4] = var4[6];
      }

      tg.a(var2, 85);
      var2[2] = var6;
      ((int[])((int[])var2[1]))[0] = var1;
      var2[4] = var4;
      ((int[])((int[])var2[1]))[2] = var0;
      ((int[])((int[])var2[1]))[1] = var5;
      return var2;
   }

   static final Object[] a(int var0, int var1, int var2) {
      Object[] var3 = ju.g[var0][var1][var2];
      return var3 == null?null:(Object[])((Object[])var3[7]);
   }

}
