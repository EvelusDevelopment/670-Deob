
final class hi {

   static int e;
   static int b;
   static int f;
   static Object[] c;
   static int d;
   static boolean a;


   static final void a(Object[] var0, Object[] var1, byte var2) {
      ija.a((Object[])((Object[])var0[2]), (Object[])((Object[])var1[2]), false);
      ++b;
      if(var2 != 110) {
         ((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var1[0]))[12]))[3]))[0] = -16;
      }

      era.a((Object[])((Object[])var0[1]), true, (Object[])((Object[])var1[2]));
      mna.a(1, (Object[])((Object[])var1[1]), (Object[])((Object[])var0[1]));
   }

   static final long a(Object[] var0, boolean var1) {
      if(!var1) {
         c = (Object[])null;
      }

      ++f;
      return ((long[])((long[])var0[2]))[0];
   }

   static final Object[] a(Object[] var0, int var1, String var2) {
      ++e;
      jma.a(var0, (byte)-125);
      nq var4 = new nq(var0);
      var0[var1] = var4;
      var0[3] = var2;
      var0[0] = osa.a(0, new Object[2]);
      return var0;
   }

   static final Object[] newByteBufferWrapper(int size) {
     Object[] var2 = new Object[3];
     aha.newIAS1I1Wrapper(var2);
     ++d;
     tp uselessvar = new tp(var2);
     var2[2] = sja.createByteArray(size);
     ((int[])((int[]) var2[1]))[0] = 0;
     var2[0] = uselessvar;
     return var2;
   }

   static {
      Object[] var1 = new Object[4];
      soa.a(var1, (int)1);
      var1[3] = lea.a(var1, true);
      ((int[])((int[])var1[1]))[0] = 16;
      if(null != var1 && var1.length == 10 && var1[3].equals(Integer.valueOf(0))) {
         cc.a(true, (Object[])null, (byte[][])null);
      }

      var1[2] = new lm[16];

      for(int var2 = 0; var2 < 16; ++var2) {
         lm var3 = ((lm[])((lm[])var1[2]))[var2] = new lm();
         var3.f = var3;
         var3.d = var3;
      }

      c = var1;
      a = false;
   }
}
