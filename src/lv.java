import java.io.IOException;

final class lv extends tha {

   static Object[] w;
   static int u;
   Object[] t;
   static int y;
   static boolean x = false;
   static int v;


   static final void a(Object[] var0, int var1) {
      dh.a((byte)90, var0);
      ++v;
      if(var1 <= 39) {
         a(false, false, (Object)null, (Object[])null);
      }

   }

   lv(Object[] var1) {
      this.t = var1;
   }

   static final void a(boolean var0, boolean var1, Object var2, Object[] var3) {
      if(var3 != null && var3.length == 10) {
         dg.a((Object[])null, (byte)-54);
      }

      ++u;
      if(!var1) {
         x = ((boolean[])((boolean[])((Object[])((Object[])var3[2]))[6]))[6];
      }

      if(var3[10] != null) {
         try {
            qi.a((Object[])((Object[])var3[10]), (int)4);
         } catch (Exception var15) {
            ;
         }

         var3[10] = null;
      }

      rm var4;
      var3[10] = null != (var4 = (rm)var2)?var4.a:null;
      if(var3[10] != null) {
         try {
            ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[0] = 0;
            ek.putByte((Object[])((Object[])var3[3]), 6);
            mba.a(3, 2, (Object[])((Object[])var3[3]));
            eda.a((byte)72, (Object[])((Object[])var3[3]), 0);
            oua.writeBytesToOutputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])var3[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var3[3]))[2])).length);
         } catch (IOException var14) {
            try {
               qi.a((Object[])((Object[])var3[10]), (int)4);
            } catch (Exception var13) {
               ;
            }

            var3[10] = null;
            ++((int[])((int[])var3[1]))[0];
            ((int[])((int[])var3[1]))[1] = -2;
         }
      }

      di.a(var3, -126, var0);
      var3[2] = null;
      ((int[])((int[])((Object[])((Object[])var3[9]))[1]))[0] = 0;

      while(true) {
         rw var5;
         Object[] var9 = (var5 = (rw)hia.b((byte)127, (Object[])((Object[])var3[6]))) == null?null:var5.y;
         if(null == var9) {
            while(true) {
               rw var7;
               var9 = null == (var7 = (rw)hia.b((byte)127, (Object[])((Object[])var3[4])))?null:var7.y;
               if(var9 == null) {
                  if(((byte[])((byte[])var3[0]))[0] != 0) {
                     try {
                        ((int[])((int[])((Object[])((Object[])var3[3]))[1]))[0] = 0;
                        ek.putByte((Object[])((Object[])var3[3]), 4);
                        ek.putByte((Object[])((Object[])var3[3]), ((byte[])((byte[])var3[0]))[0]);
                        op.putInt((Object[])((Object[])var3[3]), 0);
                        oua.writeBytesToOutputStreamWorker((Object[])((Object[])var3[10]), (byte[])((byte[])((Object[])((Object[])var3[3]))[2]), 0, ((byte[])((byte[])((Object[])((Object[])var3[3]))[2])).length);
                     } catch (IOException var12) {
                        try {
                           qi.a((Object[])((Object[])var3[10]), (int)4);
                        } catch (Exception var11) {
                           ;
                        }

                        var3[10] = null;
                        ++((int[])((int[])var3[1]))[0];
                        ((int[])((int[])var3[1]))[1] = -2;
                     }
                  }

                  ((int[])((int[])var3[1]))[2] = 0;
                  ((long[])((long[])var3[7]))[0] = he.a(117);
                  return;
               }

               ama.a((tha)(var9 == null?null:var9[1]), (byte)-96, (Object[])((Object[])var3[5]));
            }
         }

         ama.a((tha)(null == var9?null:var9[1]), (byte)-96, (Object[])((Object[])var3[8]));
      }
   }

   static final Object[] a(int var0, int var1, int var2, int var3, ka var4) {
      ++y;
      if(var4 == null) {
         return null;
      } else {
         Object[] var5 = new Object[1];
         int var9 = var4.MA();
         int var20 = var4.LA();
         int var31 = var4.RA();
         if(var5 != null && (var5.length == 12 && var5[4].equals(Integer.valueOf(1)) && var5[4].equals(Integer.valueOf(0)) || 3 == var5.length && var5[1].equals(Integer.valueOf(0)) && var5[1].equals(Integer.valueOf(1)))) {
            return null;
         } else {
            int var42 = var4.pa();
            int var53 = var4.N();
            int var64 = var4.da();
            Object[] var65 = tfa.a(var31, var53, var0, var2, var4.D(), var5, var20, var1, var9, var42, var64, var3);
            return var65;
         }
      }
   }

}
