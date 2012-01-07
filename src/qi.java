import java.io.IOException;
import java.io.OutputStream;

final class qi {

   static int c;
   static int b;
   static int g;
   static int f;
   static int e;
   static int d;
   static int a;


   static final Object[] a(Object[] var0, int var1, int var2, int var3) {
      ++d;
      dca.a(var0, -27935);
      if(var2 != var1) {
         int var5 = var1;
         int var6 = var2;
         if(var2 > var1) {
            var5 = var2;
            var6 = var1;
         }

         if(null != var0 && (20 == var0.length && var0[6].equals(Integer.valueOf(0)) && var0[6].equals(Integer.valueOf(0)) || 12 == var0.length)) {
            dca.a((Object[])null, -27935);
         }

         while(var6 != 0) {
            int var7 = var5 % var6;
            var5 = var6;
            var6 = var7;
         }

         var2 /= var5;
         var1 /= var5;
         ((int[])((int[])var0[1]))[0] = var1;
         var0[0] = new int[var1][14];
         ((int[])((int[])var0[var3]))[1] = var2;

         for(int var8 = 0; var1 > var8; ++var8) {
            int[] var9 = ((int[][])((int[][])var0[0]))[var8];
            double var10 = (double)var8 / (double)var1 + 6.0D;
            int var12 = (int)Math.floor(1.0D + (var10 - 7.0D));
            if(0 > var12) {
               var12 = 0;
            }

            int var13 = (int)Math.ceil(7.0D + var10);
            if(var13 > 14) {
               var13 = 14;
            }

            for(double var14 = (double)var2 / (double)var1; var13 > var12; ++var12) {
               double var16 = 3.141592653589793D * ((double)var12 - var10);
               double var18 = var14;
               if(var16 < -1.0E-4D || 1.0E-4D < var16) {
                  var18 = var14 * (Math.sin(var16) / var16);
               }

               var18 *= Math.cos(0.2243994752564138D * (-var10 + (double)var12)) * 0.46D + 0.54D;
               var9[var12] = (int)Math.floor(var18 * 65536.0D + 0.5D);
            }
         }

         return var0;
      } else {
         return var0;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      ++e;
      int var6 = var5 + -var2;
      int var7 = var1 + -var3;
      if(var7 == 0) {
         if(0 != var6) {
            uc.a(var2, var3, var0, 0, var5);
         }

      } else if(0 != var6) {
         if(var7 < 0) {
            var7 = -var7;
         }

         if(0 > var6) {
            var6 = -var6;
         }

         boolean var8 = var7 < var6;
         int var9;
         int var10;
         if(var8) {
            var9 = var3;
            var10 = var1;
            var3 = var2;
            var1 = var5;
            var2 = var9;
            var5 = var10;
         }

         if(var1 < var3) {
            var9 = var3;
            var10 = var2;
            var3 = var1;
            var1 = var9;
            var2 = var5;
            var5 = var10;
         }

         var9 = var2;
         if(var4 != 13429) {
            f = 62;
         }

         var10 = var1 + -var3;
         int var11 = -var2 + var5;
         int var12 = -(var10 >> 1);
         if(0 > var11) {
            var11 = -var11;
         }

         int var13 = var2 >= var5?-1:1;
         int var14;
         if(var8) {
            for(var14 = var3; var1 >= var14; ++var14) {
               fda.c[var14][var9] = var0;
               var12 += var11;
               if(var12 > 0) {
                  var12 -= var10;
                  var9 += var13;
               }
            }
         } else {
            for(var14 = var3; var14 <= var1; ++var14) {
               fda.c[var9][var14] = var0;
               var12 += var11;
               if(var12 > 0) {
                  var9 += var13;
                  var12 -= var10;
               }
            }
         }

      } else {
         eb.b(100, var3, var1, var2, var0);
      }
   }

   static final void processOutputStreamWorker(Object[] wrapper) {
      ++c;
      if(null == wrapper || -5 != ~wrapper.length) {
         while(true) {
            int length;
            synchronized(null == wrapper ? null : wrapper[0]) {
               while(true) {
                  if(null != wrapper[3]) {
                     return;
                  }
                  if(((int[]) ((int[])wrapper[1]))[2] < ((int[])((int[])wrapper[1]))[0]) {
                     length = ((int[])((int[])wrapper[1]))[2] - ((int[])((int[])wrapper[1]))[0] + ((int[])((int[])wrapper[1]))[1];
                  } else {
                     length = ((int[])((int[])wrapper[1]))[2] - ((int[])((int[])wrapper[1]))[0];
                  }

                  if(length > 0) {
                     if(null != wrapper && 1 == wrapper.length) {
                        return;
                     }
                     break;
                  }

                  try {
                     ((OutputStream) wrapper[4]).flush();
                  } catch (IOException var14) {
                     wrapper[3] = var14;
                     return;
                  }

                  try {
                     wrapper[0].wait();
                  } catch (InterruptedException var13) {
                     
                  }
               }
            }

            try {
               if(length + ((int[])((int[])wrapper[1]))[0] <= ((int[])((int[])wrapper[1]))[1]) {
                  ((OutputStream)wrapper[4]).write((byte[])((byte[]) wrapper[2]), ((int[])((int[]) wrapper[1]))[0], length);
               } else {
                  int offset = ((int[])((int[])wrapper[1]))[1] - ((int[])((int[])wrapper[1]))[0];
                  ((OutputStream)wrapper[4]).write((byte[])((byte[])wrapper[2]), ((int[])((int[])wrapper[1]))[0], offset);
                  ((OutputStream)wrapper[4]).write((byte[])((byte[])wrapper[2]), 0, length - offset);
               }
            } catch (IOException ex) {
               IOException ioex = ex;
               synchronized(null != wrapper ? wrapper[0]:null) {
                  wrapper[3] = ioex;
                  return;
               }
            }

            synchronized(null != wrapper ? wrapper[0] : null) {
               ((int[])((int[])wrapper[1]))[0] = (((int[])((int[])wrapper[1]))[0] + length) % ((int[])((int[])wrapper[1]))[1];
            }
         }
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++a;
      if(!var1) {
         ((long[])((long[])var0[9]))[12] = 27L;
      }

      int var2 = ((int[])((int[])var0[1]))[13];
      boolean var3 = ((boolean[])((boolean[])var0[8]))[2];
      if(null == var0[9]) {
         if(var0[3] != null) {
            int var4 = ji.a((Object[])((Object[])var0[3]), (byte)122);
            if(var2 != var4) {
               ((int[])((int[])var0[1]))[13] = var4;
               Object[] var5 = (Object[])((Object[])((Object[])((Object[])var0[3]))[42]);
               if(null != var5[11]) {
                  var5 = ria.a(eo.g, var5, -93);
               }

               if(var5 == null) {
                  ((int[])((int[])var0[1]))[0] = 0;
                  ((boolean[])((boolean[])var0[8]))[2] = ((boolean[])((boolean[])((Object[])((Object[])((Object[])((Object[])var0[3]))[42]))[8]))[0];
                  ((int[])((int[])var0[1]))[12] = 0;
                  ((int[])((int[])var0[1]))[3] = 256;
                  ((int[])((int[])var0[1]))[11] = 256;
                  ((int[])((int[])var0[1]))[14] = 0;
               } else {
                  ((int[])((int[])var0[1]))[12] = ((int[])((int[])var5[1]))[1];
                  ((int[])((int[])var0[1]))[3] = ((int[])((int[])var5[1]))[2];
                  ((boolean[])((boolean[])var0[8]))[2] = ((boolean[])((boolean[])var5[8]))[0];
                  ((int[])((int[])var0[1]))[11] = ((int[])((int[])var5[1]))[16];
                  ((int[])((int[])var0[1]))[0] = ((int[])((int[])var5[1]))[5] << 9;
                  ((int[])((int[])var0[1]))[14] = ((int[])((int[])var5[1]))[28] << 9;
               }
            }
         } else if(var0[5] != null) {
            ((int[])((int[])var0[1]))[13] = cja.a((byte)-51, (Object[])((Object[])var0[5]));
            ((boolean[])((boolean[])var0[8]))[2] = ((boolean[])((boolean[])((Object[])((Object[])var0[5]))[8]))[12];
            ((int[])((int[])var0[1]))[0] = ((int[])((int[])((Object[])((Object[])var0[5]))[12]))[46] << 9;
            ((int[])((int[])var0[1]))[3] = 256;
            ((int[])((int[])var0[1]))[14] = 0;
            ((int[])((int[])var0[1]))[12] = ((int[])((int[])((Object[])((Object[])var0[5]))[12]))[49];
            ((int[])((int[])var0[1]))[11] = 256;
         }
      } else {
         Object[] var6 = vs.a(0 == bw.b?qba.h:eo.g, (Object[])((Object[])var0[9]), (byte)-127);
         if(null != var6) {
            ((int[])((int[])var0[1]))[13] = ((int[])((int[])var6[1]))[0];
            if(null != var6 && (31 == var6.length || var6.length == 10)) {
               sba.a(new Object[6][], 2);
            }

            ((int[])((int[])var0[1]))[12] = ((int[])((int[])var6[1]))[5];
            ((int[])((int[])var0[1]))[9] = ((int[])((int[])var6[1]))[15];
            ((int[])((int[])var0[1]))[11] = ((int[])((int[])var6[1]))[8];
            ((boolean[])((boolean[])var0[8]))[2] = ((boolean[])((boolean[])var6[0]))[13];
            ((int[])((int[])var0[1]))[0] = ((int[])((int[])var6[1]))[4] << 9;
            ((boolean[])((boolean[])var0[8]))[1] = ((boolean[])((boolean[])var6[0]))[8];
            ((int[])((int[])var0[1]))[6] = ((int[])((int[])var6[1]))[39];
            var0[2] = var6[9];
            ((int[])((int[])var0[1]))[3] = ((int[])((int[])var6[1]))[22];
         } else {
            ((int[])((int[])var0[1]))[3] = 256;
            ((int[])((int[])var0[1]))[9] = 0;
            ((boolean[])((boolean[])var0[8]))[1] = false;
            ((int[])((int[])var0[1]))[13] = -1;
            var0[2] = null;
            ((int[])((int[])var0[1]))[14] = 0;
            ((int[])((int[])var0[1]))[12] = 0;
            ((int[])((int[])var0[1]))[11] = 256;
            ((int[])((int[])var0[1]))[6] = 0;
            ((boolean[])((boolean[])var0[8]))[2] = false;
            ((int[])((int[])var0[1]))[0] = 0;
         }
      }

      if((var2 != ((int[])((int[])var0[1]))[13] || ((boolean[])((boolean[])var0[8]))[2] != var3) && var0[6] != null) {
         ah.d.b((kp)var0[6]);
         var0[10] = null;
         var0[6] = null;
         var0[7] = null;
      }

   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 4) {
         ++g;
         if(null == var0) {
            throw new IllegalStateException();
         } else {
            jca.a((byte)-4, var0);
         }
      }
   }

   static final Object[] a(boolean var0, Object[] var1) {
      if(!var0) {
         a((Object[])null, (int)-77);
      }

      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      ++b;
      nn.a(var1, (byte)-30);
      return var1;
   }

}
