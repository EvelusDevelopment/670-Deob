
final class lla {

   private static Object[] c = ura.a(-50, new Object[2]);
   private static boolean a = false;
   private static int b = 0;


   static final synchronized void a(int var0) {
      if(var0 != 2) {
         ((long[])((long[])c[19]))[0] = -62L;
      }

      while(true) {
         Class_q var1;
         Object[] var3 = null != (var1 = (Class_q)jca.b((byte)16, c))?var1.j:null;
         if(null == var3) {
            return;
         }

         ((Class_w)var3[1]).o(true);
         ((lm)(var3 == null?null:var3[0])).a((byte)55);
      }
   }

   static final synchronized void a(boolean var0, byte var1) {
      int var2 = -37 / ((-11 - var1) / 50);
      a = var0;
   }

   static final synchronized void b(byte var0) {
      ++b;
      if(var0 != -65) {
         c = (Object[])null;
      }

   }

   static final synchronized void a(int var0, Class_w var1) {
      if(!a) {
         if(var0 >= -41) {
            ((Object[])((Object[])c[7]))[25] = c[0];
         }

         if(0 < b) {
            Object[] var4 = new Object[2];
            Class_q var6 = new Class_q(var4);
            var4[0] = var6;
            var4[1] = var1;
            client.a(127, c, (lm)(null == var4?null:var4[0]));
         } else {
            var1.o(false);
         }

      }
   }

   static final synchronized void a(byte var0) {
      --b;
      if(var0 >= -123) {
         a((byte)118);
      }

      if(0 == b) {
         a((int)2);
      }

   }

}
