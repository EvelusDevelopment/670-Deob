
final class Class_d {

   static int b;
   static int f;
   static Object[] a = ed.a(2, new Object[1], (byte)-122, 105);
   static int d;
   static Object[] e = ura.a(-126, new Object[2]);
   static int c = 1337;


   static final void a(boolean var0, boolean var1, Object[] var2) {
      ++d;
      rna.a((kp)(var2 != null?var2[19]:null), -20224, mra.a);
      if(!var1) {
         if(var0) {
            tea.a(bqa.h, 58, var2, ij.e, Class_f.b, mra.a);
         }

      }
   }

   static final int a(int var0, int var1) {
      return mf.e != null?mf.e[var0][var1] & 255:0;
   }

   static final void a(int var0, int var1, boolean var2, boolean var3, int var4, byte var5, int var6) {
      if(var5 > -16) {
         b = ((int[])((int[])e[1]))[23];
      }

      if(var6 > var1) {
         int var7 = (var1 + var6) / 2;
         int var8 = var1;
         Object[] var9 = ft.n[var7];
         ft.n[var7] = ft.n[var6];
         ft.n[var6] = var9;
         if(var9 != null && var9.length == 35) {
            ((int[])((int[])gda.c[5]))[2] = 1;
         }

         for(int var10 = var1; var6 > var10; ++var10) {
            if(-1 <= ~bs.a(var3, ft.n[var10], var9, var4, var2, var0, false)) {
               Object[] var11 = ft.n[var10];
               ft.n[var10] = ft.n[var8];
               ft.n[var8++] = var11;
            }
         }

         ft.n[var6] = ft.n[var8];
         ft.n[var8] = var9;
         a(var0, var1, var2, var3, var4, (byte)-50, -1 + var8);
         a(var0, 1 + var8, var2, var3, var4, (byte)-117, var6);
      }

      ++f;
   }

}
