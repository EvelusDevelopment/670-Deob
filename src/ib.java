import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;

final class ib {

   static Object[] f = sl.a("18", 0, new Object[1], "18");
   static int c;
   static int h;
   static int k;
   static int a;
   static int f_i;
   static int b;
   static Object[] e = fra.a(3, (byte)-120, new Object[1]);
   static int f_l;
   static Object[] g;
   static int j;
   static Object[] d = ho.a(4, 30, new Object[1], true);


   static final void a(int var0, Object[] var1, Object[] var2) {
      tk.a(var0 ^ 26396, (Object[])((Object[])var1[2]), (Object[])((Object[])var2[2]));
      ++f_i;
      rna.a((Object[])((Object[])var2[var0]), (Object[])((Object[])var1[1]), true);
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, Class_s var14, int var15, int var16) {
      bk var17;
      Object[] var18 = (var17 = (bk)var14) == null?null:var17.f_l;
      int[] var19 = (int[])((int[])var18[0]);
      int[] var20 = (int[])((int[])var18[2]);
      int var21 = var11 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
      int var22 = var12;
      if(var16 > var12) {
         var22 = var16;
         var6 += (var16 - var12) * ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
         var5 += (var16 - var12) * var13;
      }

      if(var0 == null || var0.length != 1) {
         int var23 = var16 + var19.length < var12 + var8?var16 + var19.length:var12 + var8;
         boolean var24 = false;

         for(int var25 = var22; var25 < var23; ++var25) {
            int var26 = var19[var25 - var16] + var15;
            int var27 = var20[var25 - var16];
            int var28 = var7;
            int var29;
            if(var21 > var26) {
               var29 = var21 - var26;
               if(var29 >= var27) {
                  var5 += var7 + var10;
                  var6 += var7 + var9;
                  continue;
               }

               var27 -= var29;
            } else {
               var29 = var26 - var21;
               if(var29 >= var7) {
                  var5 += var7 + var10;
                  var6 += var7 + var9;
                  continue;
               }

               var5 += var29;
               var28 = var7 - var29;
               var6 += var29;
            }

            var29 = 0;
            if(var18 != null && var18.length == 7) {
               return;
            }

            if(var28 < var27) {
               var27 = var28;
            } else {
               var29 = var28 - var27;
            }

            for(int var30 = -var27; var30 < 0; ++var30) {
               byte var31;
               if((var31 = var1[var5++]) != 0) {
                  var2[var6++] = var3[var31 & 255];
               } else {
                  ++var6;
               }
            }

            var5 += var29 + var10;
            var6 += var29 + var9;
         }

      }
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var0 != null && (var0.length == 6 || var0.length == 7)) {
         a((Object[])null, (byte[])null, (int[])null, 60, 41, 55, 75, 47, -55, 12);
      }

      int var10 = -(var6 >> 2);
      var6 = -(var6 & 3);

      for(int var11 = -var7; var11 < 0; ++var11) {
         int var12;
         for(var12 = var10; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }

            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         if(var0 != null && var0.length == 7) {
            return;
         }

         for(var12 = var6; var12 < 0; ++var12) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5) {
      if(((Object[])((Object[])var0[5]))[7] != null) {
         var2 += ((int[])((int[])var0[7]))[var1];
         var3 += ((int[])((int[])var0[1]))[var1];
         int var6 = ((int[])((int[])var0[3]))[var1];
         int var7 = ((int[])((int[])var0[6]))[var1];
         int var8 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         if(var0 == null || var0.length != 4 || !var0[0].equals(Integer.valueOf(0))) {
            int var12 = 0;
            int var13;
            if(var3 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16]) {
               var13 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16] - var3;
               var7 -= var13;
               var3 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16];
               var12 += var13 * var6;
               var9 += var13 * var8;
            }

            if(var3 + var7 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1]) {
               var7 -= var3 + var7 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1];
            }

            if(var2 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7]) {
               var13 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7] - var2;
               var6 -= var13;
               var2 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
               var12 += var13;
               var9 += var13;
               var11 += var13;
               var10 += var13;
            }

            if(var2 + var6 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19]) {
               var13 = var2 + var6 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19];
               var6 -= var13;
               var11 += var13;
               var10 += var13;
            }

            if(var6 > 0 && var7 > 0) {
               if(var5) {
                  a(var0, ((byte[][])((byte[][])var0[0]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), var4, var12, var9, var6, var7, var10, var11);
               } else {
                  a(var0, ((byte[][])((byte[][])var0[0]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), (int[])((int[])var0[2]), var12, var9, var6, var7, var10, var11);
               }

            }
         }
      }
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int[] var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var0 == null || var0.length != 11) {
         int var10 = -(var6 >> 2);
         var6 = -(var6 & 3);
         boolean var11 = false;

         for(int var12 = -var7; var12 < 0; ++var12) {
            int var13;
            byte var14;
            for(var13 = var10; var13 < 0; ++var13) {
               if((var14 = var1[var4++]) != 0) {
                  var2[var5++] = var3[var14 & 255];
               } else {
                  ++var5;
               }

               if((var14 = var1[var4++]) != 0) {
                  var2[var5++] = var3[var14 & 255];
               } else {
                  ++var5;
               }

               if((var14 = var1[var4++]) != 0) {
                  var2[var5++] = var3[var14 & 255];
               } else {
                  ++var5;
               }

               if((var14 = var1[var4++]) != 0) {
                  var2[var5++] = var3[var14 & 255];
               } else {
                  ++var5;
               }
            }

            for(var13 = var6; var13 < 0; ++var13) {
               if((var14 = var1[var4++]) != 0) {
                  var2[var5++] = var3[var14 & 255];
               } else {
                  ++var5;
               }
            }

            var5 += var8;
            if(var0 != null && var0.length == 1 && var0[0].equals(Boolean.valueOf(false))) {
               return;
            }

            var4 += var9;
         }

      }
   }

   static final void a(Object[] var0, byte var1) {
      ++h;
      if(var0 != null && var0.length == 6) {
         if(((long[])((long[])var0[3]))[0] != 0L) {
            el.a((Object[])((Object[])var0[2]), 68, ((long[])((long[])var0[3]))[0]);
            ((long[])((long[])var0[3]))[0] = 0L;
         }

      } else {
         if(var1 > -67) {
            ((byte[])((byte[])d[14]))[8] = 8;
         }

         if(null != var0 && 4 == var0.length) {
            lb.a((byte)-69, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class_s var13, int var14, int var15) {
      bk var16;
      Object[] var17 = (var16 = (bk)var13) == null?null:var16.f_l;
      int[] var18 = (int[])((int[])var17[0]);
      int[] var19 = (int[])((int[])var17[2]);
      int var20 = var10 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
      int var21 = var11;
      if(var15 > var11) {
         var21 = var15;
         var5 += (var15 - var11) * ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
         var4 += (var15 - var11) * var12;
      }

      int var22 = var15 + var18.length < var11 + var7?var15 + var18.length:var11 + var7;

      for(int var23 = var21; var23 < var22; ++var23) {
         int var24 = var18[var23 - var15] + var14;
         int var25 = var19[var23 - var15];
         int var26 = var6;
         int var27;
         if(var20 > var24) {
            var27 = var20 - var24;
            if(var27 >= var25) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var25 -= var27;
         } else {
            var27 = var24 - var20;
            if(var27 >= var6) {
               var4 += var6 + var9;
               var5 += var6 + var8;
               continue;
            }

            var4 += var27;
            var26 = var6 - var27;
            var5 += var27;
         }

         var27 = 0;
         if(var26 < var25) {
            var25 = var26;
         } else {
            var27 = var26 - var25;
         }

         for(int var28 = -var25; var28 < 0; ++var28) {
            if(var1[var4++] != 0) {
               var2[var5++] = var3;
            } else {
               ++var5;
            }
         }

         if(var0 != null && var0.length == 14) {
            a((Object[])null, 'j', -108, 43, -57, true);
         }

         var4 += var27;
         var5 += var27 + var8;
      }

      if(var0 == null || var0.length != 12 || !var0[6].equals(Integer.valueOf(2))) {
         ;
      }
   }

   static final Object[] createSocketWorker(Socket var0, int size) throws IOException {
      Object[] wrapper = new Object[4];
      ic.a(wrapper, -48);
      ++j;
      wrapper[3] = var0;
      ((Socket) wrapper[3]).setSoTimeout(30000);
      ((Socket) wrapper[3]).setTcpNoDelay(true);
      wrapper[2] = jma.a(new Object[6], ((Socket) wrapper[3]).getInputStream(), size);
      wrapper[1] = rk.a((byte)-59, ((Socket) wrapper[3]).getOutputStream(), new Object[6], size);
      return wrapper;
   }

   static final boolean a(byte var0, Object[] var1) {
      if(var0 < 14) {
         g = (Object[])((Object[])((Object[])((Object[])e[22]))[18]);
      }

      ++a;
      return (1 & ((int[])((int[])var1[1]))[0] >> 21) != 0;
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, int var3, Object[] var4, int var5, int var6) {
      ++f_l;
      if(var2[1] == null) {
         var2[1] = new int[4];
      }

      var2[4] = ne.a(var5 + 14937, var2);
      var2[2] = var1;
      var2[3] = var4;
      var2[0] = var0;
      ((int[])((int[])var2[1]))[0] = var6;
      ((int[])((int[])var2[1]))[3] = var3;
      OpenGL.glGenRenderbuffersEXT(1, tda.o, 0);
      ((int[])((int[])var2[1]))[1] = tda.o[0];
      OpenGL.glBindRenderbufferEXT('\u8d41', ((int[])((int[])var2[1]))[1]);
      OpenGL.glRenderbufferStorageEXT('\u8d41', bu.a(78, (Object[])((Object[])var2[0]), (Object[])((Object[])var2[2])), ((int[])((int[])var2[1]))[3], ((int[])((int[])var2[1]))[0]);
      ((int[])((int[])var2[var5]))[2] = ((int[])((int[])var2[1]))[0] * ((int[])((int[])var2[1]))[3] * ((int[])((int[])((Object[])((Object[])var2[2]))[0]))[0] * ((int[])((int[])((Object[])((Object[])var2[0]))[0]))[1];
      if(var4 != null && -7 == ~var4.length && var4[1].equals(Integer.valueOf(1)) && var4[1].equals(Integer.valueOf(0))) {
         ne.a(14938, (Object[])null);
      }

      return var2;
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, aea[] var3, int[] var4, int[] var5) {
      ta var9 = (ta)(var1 == null?null:var1[6]);
      vo var8 = new vo(var0, var9, var2);
      var0[4] = var8;
      var0[5] = var1;
      var0[5] = var1;
      var0[3] = var4;
      var0[6] = var5;
      var0[0] = new byte[var3.length][];
      var0[1] = new int[var3.length];
      var0[7] = new int[var3.length];

      for(int var10 = 0; var10 < var3.length; ++var10) {
         ((byte[][])((byte[][])var0[0]))[var10] = var3[var10].c;
         ((int[])((int[])var0[1]))[var10] = var3[var10].b;
         ((int[])((int[])var0[7]))[var10] = var3[var10].f;
      }

      var0[2] = var3[0].f_i;
      if(var0 != null && (var0.length == 2 || var0.length == 5)) {
         a((Object[])null, (byte[])null, (int[])null, (int[])null, 100, 86, -27, -107, -117, -61);
      }

      return var0;
   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      if(((Object[])((Object[])var0[5]))[7] != null) {
         if(var6 == null) {
            a(var0, var1, var2, var3, var4, var5);
         } else {
            var2 += ((int[])((int[])var0[7]))[var1];
            var3 += ((int[])((int[])var0[1]))[var1];
            int var9 = ((int[])((int[])var0[3]))[var1];
            int var10 = ((int[])((int[])var0[6]))[var1];
            int var11 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16] - var3;
               var10 -= var16;
               var3 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16];
               var15 += var16 * var9;
               var12 += var16 * var11;
            }

            if(var3 + var10 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1]) {
               var10 -= var3 + var10 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1];
            }

            if(var2 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7] - var2;
               var9 -= var16;
               var2 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19]) {
               var16 = var2 + var9 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19];
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               if(var0 != null && var0.length == 11) {
                  a((Object[])null, (byte[])null, (int[])null, -98, 16, -53, -72, 52, -127, 28, 11, -100, 42, (Class_s)null, 106, -127);
               }

               if(var5) {
                  a(var0, ((byte[][])((byte[][])var0[0]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), var4, var15, var12, var9, var10, var13, var14, var2, var3, ((int[])((int[])var0[3]))[var1], var6, var7, var8);
               } else {
                  a(var0, ((byte[][])((byte[][])var0[0]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), (int[])((int[])var0[2]), var4, var15, var12, var9, var10, var13, var14, var2, var3, ((int[])((int[])var0[3]))[var1], var6, var7, var8);
               }

            }
         }
      }
   }

   static final void b(Object[] var0, byte var1) {
      ++k;
      ((int[])((int[])var0[1]))[1] = 2048;
      ((int[])((int[])var0[1]))[9] = 1024;
      ((int[])((int[])var0[1]))[2] = 1024;
      ((int[])((int[])var0[1]))[8] = 1024;
      ((int[])((int[])var0[1]))[3] = 1024;
      ((int[])((int[])var0[1]))[4] = 0;
      ((int[])((int[])var0[1]))[5] = 0;
      if(var1 == -58) {
         ((int[])((int[])var0[1]))[10] = 819;
         ((int[])((int[])var0[1]))[6] = 409;
      }
   }

   static final cga a(Object[] var0, int var1, int var2) {
      if(var1 != 16) {
         g = (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])f[1]))[15]))[3]);
      }

      ++c;
      cga var3 = (cga)dna.a((byte)34, uda.m, (long)var2);
      if(var3 == null) {
         if(ug.b) {
            var3 = lna.g.a(aea.b(var0, var2), true);
         } else {
            var3 = bt.a(fd.a(-2, var2, var0), (byte)103);
         }

         il.a((long)var2, var3, true, uda.m);
      }

      return var3;
   }

}
