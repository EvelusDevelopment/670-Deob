
final class vq {

   static int d = 0;
   static cga b;
   static int a;
   static int c;


   static final void a(Object[] var0, int var1) {
      ++a;
      aqa.b(var0, var1 + 2057966420);
      int var2 = dp.r;
      Object[] var3 = uta.g = vo.E[var2] = gga.a(-113, new Object[43]);
      ((int[])((int[])var3[12]))[21] = var2;
      int var4 = tg.a(var0, var1 ^ -2057981439, 30);
      byte var5 = (byte)(var4 >> 28);
      int var6 = var4 >> 14 & 16383;
      ((int[])((int[])var3[33]))[0] = var6 - rs.f;
      int var7 = var4 & 16383;
      ((int[])((int[])var3[14]))[0] = var7 - qm.d;
      Object[] var8 = nj.a(3, new Object[2]);
      ((float[])((float[])var8[1]))[2] = (float)((((int[])((int[])var3[33]))[0] << 9) + (gn.a(var3, (byte)-110) << 8));
      ((float[])((float[])var8[1]))[1] = (float)((((int[])((int[])var3[14]))[0] << 9) + (gn.a(var3, (byte)-102) << 8));
      ((float[])((float[])var8[1]))[0] = ((float[])((float[])((Object[])((Object[])id.a(6, var3)[1]))[1]))[0];
      sra.a(var3, var8, 1);
      jca.n = ((byte[])((byte[])var3[10]))[0] = ((byte[])((byte[])var3[10]))[1] = var5;
      if(fr.a(((int[])((int[])var3[14]))[0], ((int[])((int[])var3[33]))[0], (byte)51)) {
         ++((byte[])((byte[])var3[10]))[1];
      }

      if(null != jga.g[var2]) {
         kw.b(var1 + 2057989151, var3, jga.g[var2]);
      }

      ofa.b = 0;
      ot.a[ofa.b++] = var2;
      pua.a[var2] = 0;
      if(var1 == -2057989272) {
         ca.a = 0;

         for(int var9 = 1; var9 < 2048; ++var9) {
            if(var2 != var9) {
               int var10 = tg.a(var0, 8553, 18);
               int var11 = var10 >> 16;
               int var12 = (var10 & '\uff65') >> 8;
               int var13 = 255 & var10;
               Object[][] var14 = uja.h;
               Object[] var17 = new Object[2];
               oea.a(var17, var1 ^ -2057967081);
               Object[] var18 = var14[var9] = var17;
               ((int[])((int[])var18[1]))[0] = var13 + (var11 << 28) + (var12 << 14);
               ((int[])((int[])var18[1]))[2] = -1;
               ((int[])((int[])var18[1]))[1] = 0;
               ((boolean[])((boolean[])var18[0]))[0] = false;
               ((boolean[])((boolean[])var18[0]))[1] = false;
               cj.g[ca.a++] = var9;
               pua.a[var9] = 0;
            }
         }

         ki.a(var1 ^ -2057989271, var0);
      }
   }

}
