import java.applet.Applet;

final class rta {

   static int c;
   static int a;
   static Object[] b = sd.a(new Object[1], 108, (byte)118);
   static Applet d;


   static final ka a(int var0, ta var1, Object[] var2, int var3, boolean var4) {
      ++a;
      Object[] var5 = qda.a(var0, (byte)-64, dfa.a);
      if(!var4) {
         a(-18, (ta)null, (Object[])((Object[])var2[2]), -94, false);
      }

      aa var6 = bf.f_l[((byte[])((byte[])var2[10]))[0]];
      aa var7 = 3 <= ((byte[])((byte[])var2[10]))[1]?null:bf.f_l[((byte[])((byte[])var2[10]))[1] + 1];
      Object[] var8 = (Object[])((Object[])woa.a(5, var2)[1]);
      return var2[18] != null && !ela.a((Object[])((Object[])var2[18]), 3)?mia.a((int)((float[])((float[])var8[1]))[2], var3, (int)((float[])((float[])var8[1]))[1], var5, true, (Object[])((Object[])var2[18]), 80, (int)((float[])((float[])var8[1]))[0], var6, var1, var7, (byte)2):mia.a((int)((float[])((float[])var8[1]))[2], var3, (int)((float[])((float[])var8[1]))[1], var5, true, (Object[])null, 86, (int)((float[])((float[])var8[1]))[0], var6, var1, var7, (byte)2);
   }

   static final Object[] a(byte var0, Object[] var1, boolean var2) {
      int var3 = 46 / ((var0 - 87) / 36);
      ++c;
      if(var1 != null && var1.length == 87) {
         Object[] var4 = iia.a(vk.e, var2, new Object[7], var1, (byte)83);
         return var4;
      } else if(null != var1 && var1.length == 91) {
         return kb.a((byte)119, var1, var2);
      } else {
         throw new IllegalStateException();
      }
   }

   static final int a(int var0, int var1) {
      return mca.d != null?mca.d[var0][var1] & 255:0;
   }

}
