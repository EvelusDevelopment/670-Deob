import java.io.EOFException;
import java.io.IOException;

final class nsa {

   static int d;
   static Object[] a = ve.a(new Object[1], (byte)3, 1);
   static Object[] c;
   static int[] b = new int[]{1, 0, -1, 0};


   static final boolean a(int var0, boolean var1, int var2, byte[] var3, int var4, Object[] var5) {
      ++d;
      synchronized(var5[3]) {
         boolean var10000;
         try {
            int var7;
            if(!var1) {
               var7 = (int)((mea.a((byte)110, (Object[])((Object[])var5[3])) - -519L) / 520L);
               if(0 == var7) {
                  var7 = 1;
               }
            } else {
               if(mea.a((byte)87, (Object[])((Object[])var5[0])) < (long)(6 + 6 * var0)) {
                  return false;
               }

               gla.a((byte)115, (long)(6 * var0), (Object[])((Object[])var5[0]));
               mv.a(53, oca.d, 0, 6, (Object[])((Object[])var5[0]));
               var7 = ('\uff00' & oca.d[4] << 8) + ((255 & oca.d[3]) << 16) + (oca.d[5] & 255);
               if(0 >= var7 || ~((long)var7) < ~(mea.a((byte)102, (Object[])((Object[])var5[3])) / 520L)) {
                  return false;
               }
            }

            oca.d[4] = (byte)(var7 >> 8);
            oca.d[0] = (byte)(var4 >> 16);
            oca.d[2] = (byte)var4;
            oca.d[5] = (byte)var7;
            oca.d[3] = (byte)(var7 >> 16);
            oca.d[1] = (byte)(var4 >> 8);
            gla.a((byte)-103, (long)(var0 * 6), (Object[])((Object[])var5[0]));
            rra.a(oca.d, 6, (Object[])((Object[])var5[0]), var2, 0);
            int var8 = 0;

            for(int var9 = 0; var8 < var4; ++var9) {
               int var10 = 0;
               int var11;
               if(var1) {
                  gla.a((byte)37, (long)(520 * var7), (Object[])((Object[])var5[3]));
                  int var12;
                  int var13;
                  if('\uffff' >= var0) {
                     try {
                        mv.a(-107, oca.d, 0, 8, (Object[])((Object[])var5[3]));
                     } catch (EOFException var16) {
                        break;
                     }

                     var12 = (oca.d[3] & 255) + ('\uff00' & oca.d[2] << 8);
                     var13 = oca.d[7] & 255;
                     var10 = ((oca.d[4] & 255) << 16) + ((oca.d[5] & 255) << 8) + (oca.d[6] & 255);
                     var11 = ((255 & oca.d[0]) << 8) + (255 & oca.d[1]);
                  } else {
                     try {
                        mv.a(87, oca.d, 0, 10, (Object[])((Object[])var5[3]));
                     } catch (EOFException var17) {
                        break;
                     }

                     var13 = oca.d[9] & 255;
                     var12 = ('\uff00' & oca.d[4] << 8) + (255 & oca.d[5]);
                     var11 = ('\uff00' & oca.d[2] << 8) + (oca.d[0] << 24 & -16777216) + ((255 & oca.d[1]) << 16) + (oca.d[3] & 255);
                     var10 = (oca.d[8] & 255) + (oca.d[7] << 8 & '\uff00') + ((oca.d[6] & 255) << 16);
                  }

                  if(var11 != var0 || var9 != var12 || ((int[])((int[])var5[1]))[1] != var13) {
                     return false;
                  }

                  if(0 > var10 || ~((long)var10) < ~(mea.a((byte)-89, (Object[])((Object[])var5[3])) / 520L)) {
                     return false;
                  }
               }

               if(0 == var10) {
                  var1 = false;
                  var10 = (int)((519L + mea.a((byte)-105, (Object[])((Object[])var5[3]))) / 520L);
                  if(0 == var10) {
                     ++var10;
                  }

                  if(var7 == var10) {
                     ++var10;
                  }
               }

               if(512 >= var4 + -var8) {
                  var10 = 0;
               }

               if('\uffff' < var0) {
                  oca.d[8] = (byte)var10;
                  oca.d[0] = (byte)(var0 >> 24);
                  oca.d[3] = (byte)var0;
                  oca.d[1] = (byte)(var0 >> 16);
                  oca.d[2] = (byte)(var0 >> 8);
                  oca.d[5] = (byte)var9;
                  oca.d[7] = (byte)(var10 >> 8);
                  oca.d[4] = (byte)(var9 >> 8);
                  oca.d[6] = (byte)(var10 >> 16);
                  if(var5 != null && (3 == var5.length && var5[0].equals(Integer.valueOf(1)) || var5.length == 13 && var5[7].equals(Boolean.valueOf(false)))) {
                     a(74, false, 4, (byte[])null, -25, new Object[3][]);
                  }

                  oca.d[9] = (byte)((int[])((int[])var5[1]))[1];
                  gla.a((byte)43, (long)(520 * var7), (Object[])((Object[])var5[3]));
                  rra.a(oca.d, 10, (Object[])((Object[])var5[3]), var2 ^ 0, 0);
                  var11 = var4 + -var8;
                  if(510 < var11) {
                     var11 = 510;
                  }

                  rra.a(var3, var11, (Object[])((Object[])var5[3]), 4, var8);
                  var8 += var11;
               } else {
                  oca.d[0] = (byte)(var0 >> 8);
                  if(null != var5 && 2 == var5.length) {
                     a(94, true, 4, (byte[])null, -126, (Object[])null);
                  }

                  oca.d[2] = (byte)(var9 >> 8);
                  oca.d[6] = (byte)var10;
                  oca.d[3] = (byte)var9;
                  oca.d[1] = (byte)var0;
                  oca.d[5] = (byte)(var10 >> 8);
                  oca.d[4] = (byte)(var10 >> 16);
                  oca.d[7] = (byte)((int[])((int[])var5[1]))[1];
                  gla.a((byte)-101, (long)(var7 * 520), (Object[])((Object[])var5[3]));
                  rra.a(oca.d, 8, (Object[])((Object[])var5[3]), 4, 0);
                  var11 = var4 - var8;
                  if(512 < var11) {
                     var11 = 512;
                  }

                  rra.a(var3, var11, (Object[])((Object[])var5[3]), var2 ^ 0, var8);
                  var8 += var11;
               }

               var7 = var10;
            }

            var10000 = true;
         } catch (IOException var18) {
            return false;
         }

         return var10000;
      }
   }

}
