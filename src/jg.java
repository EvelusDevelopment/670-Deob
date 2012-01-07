import jagdx.IUnknown;
import java.awt.datatransfer.Clipboard;

final class jg {

   static int d = 1;
   static int b;
   static int e;
   static int a;
   static int f;
   static Clipboard c;


   static final void a(Object[] var0, int var1) {
      ++e;
      if(var1 == 1) {
         if(var0 != null && 8 == var0.length) {
            ek.a(1, var0);
         } else if(var0 != null && var0.length == 7) {
            if(-1L != ~((long[])((long[])var0[6]))[0]) {
               IUnknown.Release(((long[])((long[])var0[6]))[0]);
               ((long[])((long[])var0[6]))[0] = 0L;
            }

            ((int[])((int[])var0[1]))[1] = 0;
            ((int[])((int[])var0[1]))[0] = 0;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final Object[] a(int var0, int var1, Object[] var2) {
      int var3 = 44 / ((var0 - 6) / 38);
      if(null == var2[5]) {
         var2[5] = new byte[1];
      }

      if(var2[1] == null) {
         var2[1] = new short[4];
      }

      ++f;
      ((byte[])((byte[])var2[5]))[0] = (byte)var1;
      return var2;
   }

   static final void a(byte var0, int var1, int var2) {
      ++b;
      if(var0 >= 60) {
         Object[] var3 = la.a(0, (long)var2 << 32 | (long)var1, 19);
         aia.a(var3, 1);
      }
   }

   static final void a(int[] var0, int[] var1, int var2, int var3, int[] var4, int[] var5, int[] var6, int var7, int[] var8, int[] var9, Object[] var10, int[] var11, Object[] var12, int[] var13, int[] var14, int[] var15, boolean var16) {
      ++a;
      int var17 = var5.length;
      int[] var18 = new int[var17 * 3];
      if(var2 == 1) {
         int[] var19 = new int[var17 * 3];
         int[] var20 = new int[3 * var17];
         if(null != var12 && -9 == ~var12.length && var12[7].equals(Integer.valueOf(2))) {
            qfa.a((Object[])null, (boolean[][])null, -99, 83, 79, -36, -30, 92, -43, -43);
         }

         int[] var21 = var8 != null?new int[3 * var17]:null;
         int[] var22 = new int[3 * var17];
         int[] var23 = new int[var17 * 3];
         int[] var24 = null == var13?null:new int[3 * var17];
         int[] var25 = null != var14?new int[var17 * 3]:null;
         int var26 = 0;

         for(int var27 = 0; var27 < var17; ++var27) {
            int var28 = var9[var27];
            int var29 = var6[var27];
            int var30 = var1[var27];
            var18[var26] = var4[var28];
            var19[var26] = var0[var28];
            var20[var26] = var5[var27];
            var22[var26] = var15[var27];
            var23[var26] = var11[var27];
            if(var8 != null) {
               var21[var26] = var8[var27];
            }

            if(null != var13) {
               var24[var26] = var13[var28];
            }

            if(var14 != null) {
               var25[var26] = var14[var28];
            }

            if(var12 != null && (var12.length == 4 || var12.length == 2)) {
               return;
            }

            ++var26;
            var18[var26] = var4[var29];
            var19[var26] = var0[var29];
            var20[var26] = var5[var27];
            var22[var26] = var15[var27];
            var23[var26] = var11[var27];
            if(null != var8) {
               var21[var26] = var8[var27];
            }

            if(var13 != null) {
               var24[var26] = var13[var29];
            }

            if(var14 != null) {
               var25[var26] = var14[var29];
            }

            ++var26;
            var18[var26] = var4[var30];
            var19[var26] = var0[var30];
            var20[var26] = var5[var27];
            var22[var26] = var15[var27];
            var23[var26] = var11[var27];
            if(var8 != null) {
               var21[var26] = var8[var27];
            }

            if(null != var13) {
               var24[var26] = var13[var30];
            }

            if(var14 != null) {
               var25[var26] = var14[var30];
            }

            ++var26;
         }

         wsa.a(var22, var7, (byte)-112, var21, var16, var18, var19, var12, var25, var3, var23, var10, var24, var20);
      }
   }

}
