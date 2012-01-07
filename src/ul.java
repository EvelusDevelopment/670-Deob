
final class ul extends lm {

   Object[] j;
   static int f_l;
   static Object[] p;
   static int k;
   static int q;
   static int n;
   static int o;
   static int m;


   static final void a(int var0, int var1, Object[] var2, int var3) {
      ((int[])((int[])var2[33]))[0] = var3;
      ((int[])((int[])var2[12]))[20] = 0;
      ++m;
      ((int[])((int[])var2[12]))[18] = 0;
      ((int[])((int[])var2[12]))[12] = 0;
      ((int[])((int[])var2[14]))[0] = var1;
      int var4 = gn.a(var2, (byte)-121);
      Object[] var5 = mha.a((byte)126, new Object[2], (Object[])((Object[])woa.a(5, var2)[1]));
      ((float[])((float[])var5[1]))[1] = (float)(var4 * 256 + 512 * ((int[])((int[])var2[14]))[0]);
      ((float[])((float[])var5[1]))[2] = (float)(((int[])((int[])var2[33]))[var0] * 512 + var4 * 256);
      sra.a(var2, var5, 1);
      if(uta.g == var2) {
         tea.a((byte)-119);
      }

      if(var2[16] != null) {
         ((ch)var2[16]).e();
      }

   }

   static final Object[] a(Object[] var0, int var1, int var2) {
      ++f_l;
      if(var2 >= -71) {
         ((byte[])((byte[])((Object[])((Object[])var0[1]))[4]))[15] = -13;
      }

      return ((Object[][])((Object[][])var0[32]))[var1];
   }

   static final String[] a(int var0, String var1, char var2) {
      ++o;
      int var4 = 0;
      int var5 = var1.length();

      int var6;
      for(var6 = 0; var6 < var5; ++var6) {
         if(var1.charAt(var6) == var2) {
            ++var4;
         }
      }

      var4 = var4;
      String[] var10 = new String[var4 + 1];
      var6 = var0;
      int var7 = 0;

      for(int var8 = 0; var4 > var8; ++var8) {
         int var9;
         for(var9 = var7; var2 != var1.charAt(var9); ++var9) {
            ;
         }

         var10[var6++] = var1.substring(var7, var9);
         var7 = 1 + var9;
      }

      var10[var4] = var1.substring(var7);
      return var10;
   }

   static final void a(int var0, byte var1) {
      int var2 = -17 % ((var1 + 51) / 40);
      ++k;
      if(162 == ww.r) {
         lf.d = var0;
      } else if(264 == ww.r) {
         jha.e = var0;
      }

   }

   static final boolean a(int var0, Object[] var1) {
      if(var0 != 1) {
         a((Object[])null, 13, -71);
      }

      ++q;
      return md.a(var1, (byte)21)?hp.a(-126, (Object[])((Object[])var1[5]), ((int[])((int[])((Object[])((Object[])var1[2]))[1]))[7]):false;
   }

   ul(Object[] var1) {
      this.j = var1;
   }

   static final void a(Object[] var0, int var1, boolean var2) {
      if(var2) {
         int var3 = sb.a(iia.r, (byte)-77, (Object[])((Object[])((Object[])((Object[])var0[1]))[2]), ((cga)var0[2]).f()) + ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[2];
         int var4 = roa.a(qga.j, 2, ((cga)var0[2]).d(), (Object[])((Object[])((Object[])((Object[])var0[1]))[4])) + ((int[])((int[])((Object[])((Object[])var0[1]))[1]))[0];
         ((cga)var0[2]).a(var3, var4);
      }

      ++n;
      if(var1 != 0) {
         p = new Object[0];
      }

   }

}
