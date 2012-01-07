
final class uw {

   static int e;
   static int a;
   static int d;
   static int c;
   static int b;


   static final int[] b(Object[] var0, byte var1) {
      ++c;
      Object[] var2 = hi.newByteBufferWrapper(518);
      if(var1 >= -71) {
         return (int[])((int[])var0[23]);
      } else {
         int[] var3 = new int[4];

         int var4;
         for(var4 = 0; 4 > var4; ++var4) {
            var3[var4] = (int)(9.9999999E7D * Math.random());
         }

         ek.putByte(var2, 10);
         op.putInt(var2, var3[0]);
         op.putInt(var2, var3[1]);
         op.putInt(var2, var3[2]);
         op.putInt(var2, var3[3]);

         for(var4 = 0; 10 > var4; ++var4) {
            op.putInt(var2, (int)(Math.random() * 9.9999999E7D));
         }

         eda.a((byte)101, var2, (int)(9.9999999E7D * Math.random()));
         mj.a(false, sd.a, ska.b, var2);
         if(var2 != null && 5 == var2.length && var2[4].equals(Integer.valueOf(1))) {
            client.c();
         }

         lr.a(((int[])((int[])var2[1]))[0], (byte[])((byte[])var2[2]), 20244, 0, (Object[])((Object[])var0[0]));
         return var3;
      }
   }

   static final ya a(Object[] var0, int var1, int var2, int var3, ya var4) {
      ++b;
      if(0 == (1 & ((byte[][])((byte[][])var0[2]))[var3][var1])) {
         return null;
      } else {
         int var7 = ((aa)var0[6]).g >> ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[9];
         uma var5;
         Object[] var9 = (var5 = (uma)var4) == null?null:var5.A;
         if(var9 != null && -17 == ~var9.length) {
            oq.a((byte)-113, -3, false, -47, (Object[])null, (ya)null, -10, -14);
         }

         Object[] var8;
         label69: {
            if(null != var9) {
               boolean var10 = var7 * var7 <= ((byte[])((byte[])var9[0])).length;
               if(var10) {
                  var8 = var9;
                  hja.a(var9, (byte)0);
                  break label69;
               }
            }

            var8 = cb.a(new Object[3], 106, (Object[])((Object[])var0[11]), var7, var7);
         }

         if(var2 <= 107) {
            return (ya)null;
         } else {
            lk.a(0, var8, var7, var7, 0, 18211);
            int[] var23 = ((int[][][])((int[][][])var0[12]))[var3][var1];
            int[] var11 = ((int[][][])((int[][][])var0[18]))[var3][var1];
            int var12 = var23.length;
            if(var9 != null && var9.length == 1) {
               return null;
            } else {
               if(var12 > ((int[])((int[])((Object[])((Object[])var0[11]))[48])).length) {
                  ((Object[])((Object[])var0[11]))[39] = new int[var12];
                  ((Object[])((Object[])var0[11]))[48] = new int[var12];
               }

               int[] var13 = (int[])((int[])((Object[])((Object[])var0[11]))[48]);
               int[] var14 = (int[])((int[])((Object[])((Object[])var0[11]))[39]);

               int var15;
               for(var15 = 0; var15 < var12; ++var15) {
                  var13[var15] = var23[var15] >> ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[9];
                  var14[var15] = var11[var15] >> ((int[])((int[])((Object[])((Object[])var0[11]))[1]))[9];
               }

               var15 = 0;

               while(var12 > var15) {
                  int var16 = var13[var15];
                  int var17 = var14[var15++];
                  int var18 = var13[var15];
                  int var19 = var14[var15++];
                  int var20 = var13[var15];
                  int var21 = var14[var15++];
                  if(-((var20 - var18) * (-var17 + var19)) + (-var21 + var19) * (var16 + -var18) > 0) {
                     uu.a(var18, var20, var19, var17, var21, (byte)71, var8, var16);
                  }
               }

               return (ya)(var8 == null?null:var8[2]);
            }
         }
      }
   }

   static final rm a(Object[] var0, int var1) {
      ++d;
      int var2 = -93 % ((var1 + 31) / 59);
      return new rm(var0);
   }

   static final Object[] a(Object[] var0, byte var1) {
      pu.b(var0, 1);
      ++e;
      int var2 = 81 % ((-23 - var1) / 55);
      return var0;
   }

   static final void a(int var0, byte var1, Object[] var2) {
      ++a;
      ((int[])((int[])var2[1]))[0] = var0;
      if(var1 < 52) {
         a((Object[])((Object[])var2[2]), ((int[])((int[])var2[12]))[1]);
      }

   }

}
