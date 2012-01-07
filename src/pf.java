import java.nio.ByteBuffer;

final class pf extends nj {

   static int f_i;
   static Object[] j = ura.a(-120, new Object[2]);
   static int n;
   Object[] k;
   static int f_l;
   static boolean m = true;


   pf(Object[] var1) {
      this.k = var1;
   }

   static final int a(boolean var0, Object[] var1) {
      ++f_i;
      if(!var0) {
         return -117;
      } else if(null != var1 && 6 == var1.length) {
         byte var2;
         if(((boolean[])((boolean[])var1[0]))[0]) {
            var2 = 0;
         } else {
            var2 = 100;
         }

         return var2;
      } else if(var1 != null && 5 == var1.length) {
         return ita.a(false, var1);
      } else {
         throw new IllegalStateException();
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, ByteBuffer var5, int var6, Object[] var7, byte var8, ByteBuffer var9) {
      ++n;
      if(var7 != null && 25 == var7.length && var7[1].equals(Boolean.valueOf(false))) {
         uea.a(-119, (Object[])null);
      }

      long var21 = -1L;
      Object[] var10;
      int var23 = var0 + (var3 << ((aa)(null != (var10 = (Object[])((Object[])var7[5]))?var10[2]:null)).a);
      Object[] var11;
      int var24 = var6 + (var1 << ((aa)((var11 = (Object[])((Object[])var7[5])) != null?var11[2]:null)).a);
      Object[] var12;
      int var25 = ((aa)((var12 = (Object[])((Object[])var7[5])) == null?null:var12[2])).a(1, var23, var24);
      if(0 == (127 & var0) || (127 & var6) == 0) {
         var21 = 65535L & (long)var23 | ((long)var24 & 65535L) << 16;
         lm var26 = pm.a(var21, (Object[])((Object[])var7[2]), false);
         if(null != var26) {
            dga var13;
            var5.putShort(((short[])((short[])(null != (var13 = (dga)var26)?var13.f_l:null)[0]))[0]);
            return;
         }
      }

      int[] var10000 = (int[])((int[])var7[1]);
      int var10003 = ((int[])((int[])var7[1]))[0];
      var10000[0] = ((int[])((int[])var7[1]))[0] + 1;
      short var44 = (short)var10003;
      if(-1L != var21) {
         Object[] var14;
         di.a((Object[])((Object[])var7[2]), true, (lm)(null != (var14 = jha.a(96, var44, new Object[2]))?var14[1]:null), var21);
      }

      float var27;
      float var29;
      float var28;
      float var31;
      float var30;
      float var34;
      float var35;
      float var32;
      float var33;
      float var36;
      float var37;
      if(var0 == 0 && var6 == 0) {
         var29 = ((float[][])((float[][])var7[3]))[var4][var2];
         var27 = ((float[][])((float[][])var7[4]))[var4][var2];
         var28 = ((float[][])((float[][])var7[7]))[var4][var2];
      } else {
         Object[] var15;
         if(((aa)((var15 = (Object[])((Object[])var7[5])) != null?var15[2]:null)).g == var0 && 0 == var6) {
            var27 = ((float[][])((float[][])var7[4]))[1 + var4][var2];
            var29 = ((float[][])((float[][])var7[3]))[1 + var4][var2];
            var28 = ((float[][])((float[][])var7[7]))[var4 + 1][var2];
         } else {
            Object[] var17;
            Object[] var16;
            if(((aa)(null != (var16 = (Object[])((Object[])var7[5]))?var16[2]:null)).g == var0 && ~var6 == ~((aa)((var17 = (Object[])((Object[])var7[5])) != null?var17[2]:null)).g) {
               var29 = ((float[][])((float[][])var7[3]))[var4 + 1][var2 + 1];
               var28 = ((float[][])((float[][])var7[7]))[var4 + 1][1 + var2];
               var27 = ((float[][])((float[][])var7[4]))[var4 + 1][var2 + 1];
            } else {
               Object[] var18;
               if(var0 == 0 && ((aa)((var18 = (Object[])((Object[])var7[5])) != null?var18[2]:null)).g == var6) {
                  var29 = ((float[][])((float[][])var7[3]))[var4][1 + var2];
                  var27 = ((float[][])((float[][])var7[4]))[var4][1 + var2];
                  var28 = ((float[][])((float[][])var7[7]))[var4][var2 + 1];
               } else {
                  Object[] var19;
                  var30 = (float)var0 / (float)((aa)(null == (var19 = (Object[])((Object[])var7[5]))?null:var19[2])).g;
                  Object[] var20;
                  var31 = (float)var6 / (float)((aa)(null == (var20 = (Object[])((Object[])var7[5]))?null:var20[2])).g;
                  var32 = ((float[][])((float[][])var7[4]))[var4][var2];
                  var33 = ((float[][])((float[][])var7[7]))[var4][var2];
                  var34 = ((float[][])((float[][])var7[3]))[var4][var2];
                  var35 = ((float[][])((float[][])var7[4]))[var4 + 1][var2];
                  var36 = ((float[][])((float[][])var7[7]))[1 + var4][var2];
                  var36 += var30 * (-var36 + ((float[][])((float[][])var7[7]))[1 + var4][var2 + 1]);
                  var33 += (-var33 + ((float[][])((float[][])var7[7]))[var4][1 + var2]) * var30;
                  var34 += (-var34 + ((float[][])((float[][])var7[3]))[var4][var2 + 1]) * var30;
                  var37 = ((float[][])((float[][])var7[3]))[1 + var4][var2];
                  var32 += (-var32 + ((float[][])((float[][])var7[4]))[var4][var2 + 1]) * var30;
                  var35 += (-var35 + ((float[][])((float[][])var7[4]))[1 + var4][1 + var2]) * var30;
                  var37 += var30 * (-var37 + ((float[][])((float[][])var7[3]))[1 + var4][1 + var2]);
                  if(null != var7 && (-9 == ~var7.length || 5 == var7.length || var7.length == 4)) {
                     return;
                  }

                  var27 = var32 + (var35 - var32) * var31;
                  var28 = var31 * (-var33 + var36) + var33;
                  var29 = var34 + (-var34 + var37) * var31;
               }
            }
         }
      }

      var30 = (float)(-var23 + lba.a((Object[])((Object[])var7[0]), -25699));
      var31 = (float)(-var25 + sla.a((Object[])((Object[])var7[0]), false));
      var32 = (float)(-var24 + fn.a((Object[])((Object[])var7[0]), -95));
      var33 = (float)Math.sqrt((double)(var32 * var32 + var31 * var31 + var30 * var30));
      var34 = 1.0F / var33;
      var31 *= var34;
      var32 *= var34;
      var30 *= var34;
      var35 = var33 / (float)mc.a(false, (Object[])((Object[])var7[0]));
      var36 = -(var35 * var35) + 1.0F;
      if(0.0F > var36) {
         var36 = 0.0F;
      }

      var37 = var27 * var30 + var31 * var28 + var29 * var32;
      if(0.0F > var37) {
         var37 = 0.0F;
      }

      float var38 = var36 * var37 * 2.0F;
      if(1.0F < var38) {
         var38 = 1.0F;
      }

      int var39 = gaa.a((Object[])((Object[])var7[0]), (byte)-69);
      if(var8 > -8) {
         a(true, (Object[])null);
      }

      int var40 = (int)(var38 * (float)((var39 & 16734227) >> 16));
      if(var40 > 255) {
         var40 = 255;
      }

      int var41 = (int)((float)(255 & var39 >> 8) * var38);
      if(var41 > 255) {
         var41 = 255;
      }

      int var42 = (int)((float)(255 & var39) * var38);
      var9.putFloat((float)var23);
      if(255 < var42) {
         var42 = 255;
      }

      var9.putFloat((float)var25);
      var9.putFloat((float)var24);
      if(((int[])((int[])((Object[])((Object[])var7[8]))[1]))[9] != 0) {
         var9.put((byte)var40);
         var9.put((byte)var41);
         var9.put((byte)var42);
      } else {
         var9.put((byte)var42);
         var9.put((byte)var41);
         var9.put((byte)var40);
      }

      var9.put((byte)-1);
      var5.putShort(var44);
   }

   static final int[] a(byte var0) {
      ++f_l;
      if(var0 < 122) {
         j = (Object[])null;
      }

      return new int[]{haa.c, il.a, fha.n};
   }

}
