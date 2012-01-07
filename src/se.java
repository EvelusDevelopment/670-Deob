
final class se {

   static int c;
   static int a;
   static int b;
   static int d;


   static final boolean a(Object[] var0, byte var1) {
      ++b;
      if(var1 != -122) {
         a(((int[])((int[])var0[6]))[15], 48, -10, -65, 38, (Object[])null, -5, ((int[])((int[])var0[1]))[1], ((int[])((int[])var0[7]))[0], (Object[])null);
      }

      return hqa.a((Object[])((Object[])var0[5]), -51) && 0 == bg.a(true, (Object[])((Object[])var0[5])) && 96 > lu.a((Object[])((Object[])var0[23]), (byte)-3);
   }

   static final boolean a(Object[] var0, Object[] var1, int var2) {
      ++c;
      if(var1[0] == null) {
         if(0 <= ((int[])((int[])var1[1]))[13]) {
            ((lm)(var1 != null?var1[2]:null)).a((byte)74);
            if(((int[])((int[])var1[1]))[6] > 0 && var1 == ((Object[][][])((Object[][][])var0[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]]) {
               ((Object[][][])((Object[][][])var0[21]))[((int[])((int[])var1[1]))[3]][((int[])((int[])var1[1]))[6]] = null;
            }
         }

         return true;
      } else {
         return var2 <= 116?((boolean[])((boolean[])((Object[])((Object[])var0[8]))[4]))[3]:false;
      }
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, Object[] var5, int var6, int var7, int var8, Object[] var9) {
      ++a;
      int var11 = rr.a(false, var5);
      if(~var11 != 0) {
         cga var12 = null;
         var12 = (cga)dna.a((byte)34, gg.b, (long)var11);
         if(var12 == null) {
            aea[] var13 = aea.a(lta.h, var11, 0);
            if(var13 == null) {
               return;
            }

            var12 = lna.g.a(var13[0], true);
            il.a((long)var11, var12, true, gg.b);
         }

         Object[] var23 = (Object[])((Object[])woa.a(5, var9)[1]);
         wb.a(false, (int)((float[])((float[])var23[1]))[1], 256 * dg.a(-110, var9), (byte)-39, 0, ((byte[])((byte[])var9[10]))[0], (int)((float[])((float[])var23[1]))[2]);
         int var14 = (int)(-18.0F + og.a[0] + (float)var7);
         if(var2 == -18191) {
            var14 += 18 * (var1 / 4);
            if(null != var23 && var23.length == 42) {
               nta.e = ((int[])((int[])((Object[])((Object[])((Object[])((Object[])lb.v[10]))[2]))[1]))[1];
            }

            int var15 = (int)(-54.0F + ((float)var3 + og.a[1] - 16.0F));
            var15 += 18 * (var1 % 4);
            var12.a(var14, var15);
            if(var5 == var9) {
               lna.g.a(var15 - 1, (byte)-121, -256, 18, (int)18, var14 - 1);
            }

            kta var17;
            Object[] var18 = (var17 = (kta)rv.a(rd.q, -61)) != null?var17.f_l:null;
            Object[] var16;
            if(var18 == null) {
               Object[] var20 = new Object[3];
               if(var20[1] == null) {
                  var20[1] = new int[4];
               }

               kta var22 = new kta(var20);
               var20[2] = var22;
               var16 = var20;
            } else {
               --sfa.c;
               var16 = var18;
            }

            var16[0] = var5;
            ((int[])((int[])var16[1]))[3] = var14 + 16;
            ((int[])((int[])var16[1]))[2] = 16 + var15;
            ((int[])((int[])var16[1]))[0] = var15;
            ((int[])((int[])var16[1]))[1] = var14;
            Object[] var10;
            gt.a(vja.f_i, -124, (nj)((var10 = var16) != null?var10[2]:null));
         }
      }
   }

   static final void a(Object[] var0, int var1) {
      if(null != var0 && -11 == ~var0.length && var0[3].equals(Boolean.valueOf(false))) {
         a((Object[])null, (int)125);
      }

      ++d;
      int var3 = ((int[])((int[])var0[0]))[6] * 512 + 256;
      int var4 = 256 + ((int[])((int[])var0[0]))[5] * 512;
      int var5 = ((int[])((int[])var0[0]))[4];
      int var6 = -28 % ((63 - var1) / 60);
      if(var5 < 3 && fr.a(((int[])((int[])var0[0]))[5], ((int[])((int[])var0[0]))[6], (byte)51)) {
         ++var5;
      }

      Object[] var7 = new Object[20];
      int var8 = ((int[])((int[])var0[0]))[1];
      int var11 = ((int[])((int[])var0[0]))[4];
      int var17 = Class_ds.a(((int[])((int[])var0[0]))[4], var3, var4, (byte)122) + -((int[])((int[])var0[0]))[2];
      Object[] var22 = tha.a(var17, 0, var11, ((int[])((int[])var0[0]))[6], var3, ((int[])((int[])var0[0]))[3], 12, ((int[])((int[])var0[0]))[5], false, var5, var4, ((int[])((int[])var0[0]))[5], var8, ((int[])((int[])var0[0]))[6], var7);
      Object[] var2;
      wf.a((long)(((int[])((int[])var0[0]))[6] << 16 | ((int[])((int[])var0[0]))[5]), -85, hi.c, (lm)(null != (var2 = kd.a(var22, new Object[2], 107))?var2[0]:null));
   }

}
